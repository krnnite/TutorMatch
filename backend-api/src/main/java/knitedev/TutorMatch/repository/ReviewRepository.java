package knitedev.TutorMatch.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import knitedev.TutorMatch.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findAllByCourseId(long courseId);
}
