package knitedev.TutorMatch.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import knitedev.TutorMatch.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findByTutorIdAndCourseName(long tutorId, String courseName);
    Course findByCourseId(long courseId);
    boolean existsByCourseNameIgnoreCase(String courseName);
}
