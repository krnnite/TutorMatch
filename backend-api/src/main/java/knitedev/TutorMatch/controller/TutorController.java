package knitedev.TutorMatch.controller;
import java.net.URI;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import knitedev.TutorMatch.dto.TutorRegistrationRequest;
import knitedev.TutorMatch.dto.TutorResponse;
import knitedev.TutorMatch.dto.TutorUpdateRequest;
import knitedev.TutorMatch.service.TutorProfileService;

@RestController 
@RequestMapping("/api/tutors")
public class TutorController {
    private final TutorProfileService tutorService;
    public TutorController(TutorProfileService tutorService) {
        this.tutorService = tutorService;
    }

    @PostMapping 
    public ResponseEntity<TutorResponse> register(@Valid @RequestBody TutorRegistrationRequest request) {
        TutorResponse tutor = tutorService.register(request);
        return ResponseEntity.created(URI.create("api/tutors/" + tutor.id())).body(tutor);
    }

    @PutMapping("/{tutorId}")
    public TutorResponse updateProfile(@PathVariable long tutorId, @Valid @RequestBody TutorUpdateRequest request) {
        return tutorService.updateProfile(tutorId, request);
    }

    
}
