package knitedev.TutorMatch.dto;
import java.time.LocalDate;
import knitedev.TutorMatch.entity.Student;

public record StudentResponse(
    long id,
    String name,
    LocalDate dayJoined,
    String educationLevel,
    String biography
) {
    public static StudentResponse from (Student student) {
        return new StudentResponse(student.getId(), student.getName(), student.getDayJoined(), student.getEducationLevel(), student.getBiography());
    }
}
