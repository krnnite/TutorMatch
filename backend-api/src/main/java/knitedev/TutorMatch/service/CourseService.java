package knitedev.TutorMatch.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import knitedev.TutorMatch.dto.CourseRegistrationRequest;
import knitedev.TutorMatch.dto.CourseResponse;
import knitedev.TutorMatch.entity.Course;
import knitedev.TutorMatch.entity.Tutor;
import knitedev.TutorMatch.repository.CourseRepository;
import knitedev.TutorMatch.repository.TutorRepository;

@Service 
@Transactional 
public class CourseService {
    private CourseRepository courseRepository;
    private TutorRepository tutorRepository;

    public CourseService(CourseRepository courseRepository, TutorRepository tutorRepository) {
        this.courseRepository = courseRepository; 
        this.tutorRepository = tutorRepository;
    }

    public CourseResponse create(CourseRegistrationRequest request) {
        Tutor tutor = tutorRepository.findById(request.tutorId()).orElseThrow(() -> new RuntimeException("Tutor not found with id " + request.tutorId()));
        Course course = new Course();
        course.setCourseName(request.courseName());
        course.setCourseDescription(request.courseDescription());
        course.setTutor(tutor);
        return CourseResponse.from(courseRepository.save(course));
    }
}
