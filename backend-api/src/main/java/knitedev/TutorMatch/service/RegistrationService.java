package knitedev.TutorMatch.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import knitedev.TutorMatch.dto.RegistrationRequest;
import knitedev.TutorMatch.dto.RegistrationResponse;
import knitedev.TutorMatch.entity.Course;
import knitedev.TutorMatch.entity.Registration;
import knitedev.TutorMatch.entity.Student;
import knitedev.TutorMatch.entity.Tutor;
import knitedev.TutorMatch.repository.CourseRepository;
import knitedev.TutorMatch.repository.RegistrationRepository;
import knitedev.TutorMatch.repository.StudentRepository;
import knitedev.TutorMatch.repository.TutorRepository;

@Service 
@Transactional 
public class RegistrationService {
    private RegistrationRepository registrationRepository;
    private CourseRepository courseRepository;
    private StudentRepository studentRepository;
    
    public RegistrationService(RegistrationRepository registrationRepository, CourseRepository courseRepository, StudentRepository studentRepository, TutorRepository tutorRepository) {
        this.registrationRepository = registrationRepository;
        this.courseRepository = courseRepository;
        this.studentRepository = studentRepository;
    }

    public RegistrationResponse create(RegistrationRequest request) {
        Course course = courseRepository.findById(request.courseId()).orElseThrow(() -> new RuntimeException("Tutor not found with id " + request.courseId()));
        Student student = studentRepository.findById(request.studentId()).orElseThrow(() -> new RuntimeException("Tutor not found with id " + request.studentId()));
        Registration registration = new Registration();
        registration.setDayRegistered(request.dayRegistered());
        registration.setCourse(course);
        registration.setStudent(student);
        return RegistrationResponse.from(registrationRepository.save(registration));
    }
    
}
