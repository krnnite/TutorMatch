package knitedev.TutorMatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import knitedev.TutorMatch.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    
}
