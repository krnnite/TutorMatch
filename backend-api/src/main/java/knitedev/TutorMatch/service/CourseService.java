package knitedev.TutorMatch.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import knitedev.TutorMatch.dto.CourseRegistrationRequest;
import knitedev.TutorMatch.dto.CourseResponse;
import knitedev.TutorMatch.entity.Course;
import knitedev.TutorMatch.repository.CourseRepository;
import knitedev.TutorMatch.repository.TutorRepository;

@Service 
@Transactional 
public class CourseService {
    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository; 
    }

    public CourseResponse create(CourseRegistrationRequest request) {
        //FIXME:validate course name is unique
        Course course = new Course();
        course.setCourseName(request.courseName());
        course.setCourseDescription(request.courseDescription());
        return CourseResponse.from(courseRepository.save(course));
    }
}
