package knitedev.TutorMatch.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import knitedev.TutorMatch.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    List<Registration> findAllByCourse_Id(long courseId);
    List<Registration> findAllByStudent_Id(long studentId);
}
