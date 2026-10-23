package knitedev.TutorMatch.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import knitedev.TutorMatch.entity.Student;
import knitedev.TutorMatch.dto.StudentUpdateRequest;
import knitedev.TutorMatch.dto.StudentRegistrationRequest;
import knitedev.TutorMatch.dto.StudentResponse;
import knitedev.TutorMatch.repository.StudentRepository;
import java.nio.charset.StandardCharsets;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service 
@Transactional 
public class StudentProfileService {
    private final StudentRepository studentRepository;
    private final PasswordEncoder passwordEncoder;
    
    public StudentProfileService(StudentRepository studentRepository, PasswordEncoder passwordEncoder) {
        this.studentRepository = studentRepository;
        this.passwordEncoder = passwordEncoder;
    }

    private void ensureUsernameAvailable(String username) {
        if (studentRepository.existsByUsernameIgnoreCase(username)) {
            throw new ConflictException("An account with that username already exists.");
        }
    }

    public Student findStudent(long studentId) {
        return studentRepository.findById(studentId).orElseThrow(() -> new NotFoundException("student " + studentId + " was not found."));
    }

    public StudentResponse register(StudentRegistrationRequest request) {
        ensureUsernameAvailable(request.username());
        if (request.password().getBytes(StandardCharsets.UTF_8).length > 72) {
            throw new BadRequestException("Password must be no more than 72 UTF-8 bytes.");
        }
        Student student = new Student();
        student.setName(request.name());
        student.setUsername(request.username());
        student.setPassword(passwordEncoder.encode(request.password()));
        student.setDayJoined(request.dayJoined());
        student.setEducationLevel(request.educationLevel());
        student.setBiography(request.biography());
        return StudentResponse.from(studentRepository.save(student));
    }

    @Transactional(readOnly = true)
    public StudentResponse getProfile(long studentId) {
        return StudentResponse.from(findStudent(studentId));
    }

    public StudentResponse updateProfile(long studentId, StudentUpdateRequest request) {
        Student student = findStudent(studentId);
        if (!student.getUsername().equalsIgnoreCase(request.username())
                && studentRepository.existsByUsernameIgnoreCase(request.username())) {
            throw new ConflictException("An account with that username already exists.");
        }
        student.setName(request.name().trim());
        student.setUsername(request.username().trim());
        student.setBiography(request.biography());
        student.setEducationLevel(request.educationLevel());
        return StudentResponse.from(studentRepository.save(student));
    }
}
