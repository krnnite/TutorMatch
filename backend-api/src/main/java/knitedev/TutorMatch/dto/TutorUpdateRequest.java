package knitedev.TutorMatch.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record TutorUpdateRequest(
    @NotBlank @Size(max = 50) String name,
    @NotBlank @Size(max = 50) String username,
    @NotBlank @Size(max = 60) String educationLevel,
    @NotBlank @Size(max = 1000) String biography
) {
    
}