package knitedev.TutorMatch.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import knitedev.TutorMatch.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    boolean existsByUsernameIgnoreCase(String username);
    Optional<Student> findById(long studentId);
    List<Student> findAll();
}
