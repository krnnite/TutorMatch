package knitedev.TutorMatch.service;

import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import knitedev.TutorMatch.repository.TutorRepository;
import org.springframework.security.crypto.password.PasswordEncoder;


@Service 
@Transactional 
public class TutorService {
    private final TutorRepository tutorRepository;
    private final PasswordEncoder passwordEncoder;
    
    public TutorService(TutorRepository tutorRepository, PasswordEncoder passwordEncoder) {
        this.tutorRepository = tutorRepository;
        this.passwordEncoder = passwordEncoder;
    }
}
