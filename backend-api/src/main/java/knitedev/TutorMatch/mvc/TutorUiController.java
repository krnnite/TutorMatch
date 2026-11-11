package knitedev.TutorMatch.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import knitedev.TutorMatch.service.TutorProfileService;

@Controller
@RequestMapping("/tutors") 
public class TutorUiController {
    private final TutorProfileService tutorProfileService;

    public TutorUiController(TutorProfileService tutorProfileService) {
        this.tutorProfileService = tutorProfileService;
    }
    
}
