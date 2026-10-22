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
import knitedev.TutorMatch.dto.RegistrationRequest;
import knitedev.TutorMatch.dto.RegistrationResponse;
import knitedev.TutorMatch.dto.StudentRegistrationRequest;
import knitedev.TutorMatch.dto.StudentResponse;
import knitedev.TutorMatch.dto.StudentUpdateRequest;
import knitedev.TutorMatch.service.RegistrationService;
import knitedev.TutorMatch.service.StudentProfileService;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentProfileService studentService;
    private final RegistrationService registrationService;
    public StudentController(StudentProfileService studentService, RegistrationService registrationService) {
        this.studentService = studentService;
        this.registrationService = registrationService;
    }

    @PostMapping 
    public ResponseEntity<StudentResponse> register(@Valid @RequestBody StudentRegistrationRequest request) {
        StudentResponse student = studentService.register(request);
        return ResponseEntity.created(URI.create("api/students/" + student.id())).body(student);
    }

    @PutMapping("/{studentId}")
    public StudentResponse updateProfile(@PathVariable long studentId, @Valid @RequestBody StudentUpdateRequest request) {
        return studentService.updateProfile(studentId, request);
    }

    @PostMapping("/{studentId}/courses")
    public ResponseEntity<RegistrationResponse> bookCourse(@PathVariable Long studentId, @Valid @RequestBody RegistrationRequest request) {
        RegistrationResponse registration = registrationService.create(request);
        return ResponseEntity.created(URI.create("/api/students/" + studentId + "/courses/" + registration.id())).body(registration);
    }
}
