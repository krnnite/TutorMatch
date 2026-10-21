package knitedev.TutorMatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import knitedev.TutorMatch.entity.Tutor;

public interface TutorRepository extends JpaRepository<Tutor, Long> {
    
}
