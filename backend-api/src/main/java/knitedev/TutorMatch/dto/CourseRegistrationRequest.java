package knitedev.TutorMatch.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record CourseRegistrationRequest(
    @NotNull long tutorId,
    @NotBlank @Size(max = 50) String courseName,
    @NotBlank @Size(max = 1000) String courseDescription,
    @NotBlank @Size(max = 50) String tutorName
) {
    
}
