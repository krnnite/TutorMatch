package knitedev.TutorMatch.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import knitedev.TutorMatch.dto.ReviewResponse;
import knitedev.TutorMatch.dto.ReviewSubmissionRequest;
import knitedev.TutorMatch.entity.Review;
import knitedev.TutorMatch.repository.CourseRepository;
import knitedev.TutorMatch.repository.ReviewRepository;
import knitedev.TutorMatch.repository.StudentRepository;

@Service
@Transactional 
public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final CourseRepository courseRepository;
    private final StudentRepository studentRepository;
    
    public ReviewService(ReviewRepository reviewRepository, CourseRepository courseRepository, StudentRepository studentRepository) {
        this.reviewRepository = reviewRepository;
        this.courseRepository = courseRepository;
        this.studentRepository = studentRepository;
    }

    public ReviewResponse create(ReviewSubmissionRequest request, long tutorId, long studentId, String courseName) {
        
        Review review = new Review();
        review.setRating(request.rating());
        review.setDescription(request.description());
        review.setCourse(courseRepository.findByTutorIdAndCourseName(tutorId, courseName));
        review.setStudent(studentRepository.findByStudentId(studentId));
        return ReviewResponse.from(reviewRepository.save(review));
    }

}
