package knitedev.TutorMatch.controller;
import java.net.URI;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import knitedev.TutorMatch.dto.CourseRegistrationRequest;
import knitedev.TutorMatch.dto.CourseResponse;
import knitedev.TutorMatch.service.CourseService;

@RestController
@RequestMapping("/api/services")
public class CourseController {
    private final CourseService courseService;
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public ResponseEntity<CourseResponse> create(@Valid @RequestBody CourseRegistrationRequest request) {
        CourseResponse course = courseService.create(request);
        return ResponseEntity.created(URI.create("/api/services/" + course.id())).body(course);
    }
}
