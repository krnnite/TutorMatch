package knitedev.TutorMatch.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import knitedev.TutorMatch.dto.TutorRegistrationRequest;
import knitedev.TutorMatch.dto.TutorResponse;
import knitedev.TutorMatch.dto.TutorUpdateRequest;
import knitedev.TutorMatch.entity.Tutor;
import knitedev.TutorMatch.repository.TutorRepository;
import java.nio.charset.StandardCharsets;
import org.springframework.security.crypto.password.PasswordEncoder;


@Service 
@Transactional 
public class TutorProfileService {
    private final TutorRepository tutorRepository;
    private final PasswordEncoder passwordEncoder;
    
    public TutorProfileService(TutorRepository tutorRepository, PasswordEncoder passwordEncoder) {
        this.tutorRepository = tutorRepository;
        this.passwordEncoder = passwordEncoder;
    }

    private void ensureUsernameAvailable(String username) {
        if (tutorRepository.existsByUsernameIgnoreCase(username)) {
            throw new ConflictException("An account with that username already exists.");
        }
    }

    public Tutor findTutor(long tutorId) {
        return tutorRepository.findById(tutorId).orElseThrow(() -> new NotFoundException("Tutor " + tutorId + " was not found."));
    }

    public TutorResponse register(TutorRegistrationRequest request) {
        ensureUsernameAvailable(request.username());
        if (request.password().getBytes(StandardCharsets.UTF_8).length > 72) {
            throw new BadRequestException("Password must be no more than 72 UTF-8 bytes.");
        }
        Tutor tutor = new Tutor();
        tutor.setName(request.name());
        tutor.setUsername(request.username());
        tutor.setPassword(passwordEncoder.encode(request.password()));
        tutor.setDayJoined(request.dayJoined());
        tutor.setEducationLevel(request.educationLevel());
        tutor.setBiography(request.biography());
        return TutorResponse.from(tutorRepository.save(tutor));
    }

    @Transactional(readOnly = true)
    public TutorResponse getProfile(long tutorId) {
        return TutorResponse.from(findTutor(tutorId));
    }

    public TutorResponse updateProfile(long tutorId, TutorUpdateRequest request) {
        Tutor tutor = findTutor(tutorId);
        if (!tutor.getUsername().equalsIgnoreCase(request.username())
                && tutorRepository.existsByUsernameIgnoreCase(request.username())) {
            throw new ConflictException("An account with that username already exists.");
        }
        tutor.setName(request.name().trim());
        tutor.setUsername(request.username().trim());
        tutor.setBiography(request.biography());
        tutor.setEducationLevel(request.educationLevel());
        return TutorResponse.from(tutorRepository.save(tutor));
    }
}
