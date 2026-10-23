package knitedev.TutorMatch.dto;
import java.time.LocalDate;
import knitedev.TutorMatch.entity.Tutor;

public record TutorResponse(
    long id,
    String name,
    LocalDate dayJoined,
    String educationLevel
) {
    public static TutorResponse from (Tutor tutor) {
        return new TutorResponse(tutor.getId(), tutor.getName(), tutor.getDayJoined(), tutor.getEducationLevel());
    }
}
