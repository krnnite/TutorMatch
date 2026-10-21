package knitedev.TutorMatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import knitedev.TutorMatch.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    
}
