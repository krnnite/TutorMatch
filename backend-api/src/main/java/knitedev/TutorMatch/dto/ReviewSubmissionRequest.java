package knitedev.TutorMatch.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ReviewSubmissionRequest(
    @NotNull  float rating,
    @NotBlank String description,
    @NotNull long courseId
) {
    
}
