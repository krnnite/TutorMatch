package knitedev.TutorMatch.dto;
import jakarta.validation.constraints.NotNull;

public record RegistrationRequest(
    @NotNull long tutorId,
    @NotNull long studentId,
    @NotNull long courseId
) {
    
}
