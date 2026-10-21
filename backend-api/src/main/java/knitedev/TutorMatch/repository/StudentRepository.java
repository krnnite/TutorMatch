package knitedev.TutorMatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import knitedev.TutorMatch.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
