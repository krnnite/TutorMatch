package knitedev.TutorMatch.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import knitedev.TutorMatch.entity.Tutor;

public record CourseRegistrationRequest(
    @NotBlank @Size(max = 50) String courseName,
    @NotBlank @Size(max = 1000) String courseDescription,
    @NotNull Tutor tutor
) {
    
}
