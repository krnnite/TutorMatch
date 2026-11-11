package knitedev.TutorMatch.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import knitedev.TutorMatch.entity.Student;
import knitedev.TutorMatch.entity.Tutor;

public interface StudentRepository extends JpaRepository<Student, Long> {
    boolean existsByUsernameIgnoreCase(String username);
    Optional<Student> findById(long studentId);
    List<Student> findAll();
    Optional<Student> findByUsernameIgnoreCase(String username);
}
