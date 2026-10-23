package knitedev.TutorMatch.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import knitedev.TutorMatch.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findByTutor_IdAndCourseName(long tutorId, String courseName);
    Optional<Course> findById(long courseId);
    boolean existsByCourseNameIgnoreCase(String courseName);
}
