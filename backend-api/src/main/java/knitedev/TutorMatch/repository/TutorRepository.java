package knitedev.TutorMatch.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import knitedev.TutorMatch.entity.Tutor;

public interface TutorRepository extends JpaRepository<Tutor, Long> {
    boolean existsByUsernameIgnoreCase(String username);
    Optional<Tutor> findById(long tutorId);
    List<Tutor> findAll();
}
