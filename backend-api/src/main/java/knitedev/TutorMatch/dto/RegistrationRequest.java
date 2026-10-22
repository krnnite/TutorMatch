package knitedev.TutorMatch.dto;
import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

public record RegistrationRequest(
    @NotNull @PastOrPresent LocalDate dayRegistered,
    @NotNull long studentId,
    @NotNull long courseId
) {
    
}

