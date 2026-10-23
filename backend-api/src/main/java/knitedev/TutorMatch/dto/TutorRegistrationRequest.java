package knitedev.TutorMatch.dto;
import java.time.LocalDate;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

public record TutorRegistrationRequest(
    @NotBlank @Size(max = 50) String name,
    @NotBlank @Size(max = 50) String username,
    @NotBlank @Size(min = 8, max = 74) String password,
    @NotNull @PastOrPresent LocalDate dayJoined,
    @NotBlank @Size(max = 60) String educationLevel,
    @NotBlank @Size(max = 1000) String biography
) {
    
}
