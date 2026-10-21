package knitedev.TutorMatch.dto;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CourseDeletionRequest(
    @NotNull long tutorId,
    @NotBlank @Size(max = 50) String courseName
) {
    
}
