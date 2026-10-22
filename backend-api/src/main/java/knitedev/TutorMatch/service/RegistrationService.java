package knitedev.TutorMatch.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import knitedev.TutorMatch.dto.RegistrationRequest;
import knitedev.TutorMatch.dto.RegistrationResponse;
import knitedev.TutorMatch.entity.Registration;
import knitedev.TutorMatch.repository.CourseRepository;
import knitedev.TutorMatch.repository.RegistrationRepository;
import knitedev.TutorMatch.repository.StudentRepository;
import knitedev.TutorMatch.repository.TutorRepository;

@Service 
@Transactional 
public class RegistrationService {
    private RegistrationRepository registrationRepository;
    
    public RegistrationService(RegistrationRepository registrationRepository, CourseRepository courseRepository, StudentRepository studentRepository, TutorRepository tutorRepository) {
        this.registrationRepository = registrationRepository;
    }

    public RegistrationResponse create(RegistrationRequest request) {
        Registration registration = new Registration();
        registration.setDayRegistered(request.dayRegistered());
        return RegistrationResponse.from(registrationRepository.save(registration));
    }
    
}
