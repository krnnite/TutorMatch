package knitedev.TutorMatch.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import knitedev.TutorMatch.dto.StudentResponse;
import knitedev.TutorMatch.dto.TutorRegistrationRequest;
import knitedev.TutorMatch.dto.TutorResponse;
import knitedev.TutorMatch.service.BadRequestException;
import knitedev.TutorMatch.service.StudentProfileService;
import knitedev.TutorMatch.service.TutorProfileService;

@Controller 
public class TutorMatchController {
    private final TutorProfileService tutorProfileService;
    private final StudentProfileService studentProfileService;

    public TutorMatchController(TutorProfileService tutorProfileService, StudentProfileService studentProfileService) {
        this.tutorProfileService = tutorProfileService;
        this.studentProfileService = studentProfileService;
    }

    @GetMapping ("/")
    public String home() {
        return "public/index";
    }

    @GetMapping("/login")
    public String login() {
        return "public/login";
    }

    @PostMapping("/login")
    public String authenticate(@RequestParam String role, @RequestParam String username, @RequestParam String password, HttpSession session) {
        if ("tutor".equalsIgnoreCase(role)) {
            TutorResponse tutor = tutorProfileService.authenticate(username, password);
            session.setAttribute("userId", tutor.id());
            session.setAttribute("userRole", "tutor");
            session.setAttribute("userName", tutor.name());
            return "redirect:/tutors/dashboard";
        }

        if (!"student".equalsIgnoreCase(role)) {
            throw new BadRequestException("Choose a valid account type.");
        }

        StudentResponse student = studentProfileService.authenticate(username, password);
        session.setAttribute("userId", student.id());
        session.setAttribute("userRole", "student");
        session.setAttribute("userName", student.name());
        return "redirect:/students/dashboard";
    }

    @GetMapping("/tutor/register")
    public String registerTutor() {
        return "tutor/register";
    }

    @PostMapping("/tutor/register")
    public String createTutor(@Valid TutorRegistrationRequest request, HttpSession session) {
        TutorResponse tutor = tutorProfileService.register(request);
        setSession(session, tutor.id(), "tutor", tutor.name());
        return "redirect:/tutors/dashboard";
    }

    @PostMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

    private void setSession(HttpSession session, Long id, String role, String name) {
        session.setAttribute("userId", id);
        session.setAttribute("userRole", role);
        session.setAttribute("userName", name);
    }
}
