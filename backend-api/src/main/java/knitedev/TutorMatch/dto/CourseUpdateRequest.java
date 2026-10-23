package knitedev.TutorMatch.dto;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;

public record CourseUpdateRequest(
    @NotBlank @Size(max = 50) String courseName,
    @NotBlank @Size(max = 1000) String courseDescription
) {
    
}
