package knitedev.TutorMatch.dto;
import java.time.LocalDate;

import knitedev.TutorMatch.entity.Registration;

public record RegistrationResponse(
    long id,
    LocalDate dayRegistered,
    long tutorId,
    String tutorName,
    long studentId,
    String studentName,
    long courseId,
    String courseName
) {
    public static RegistrationResponse from (Registration registration) {
        return new RegistrationResponse(registration.getId(), registration.getDayRegistered(), registration.getCourse().getTutor().getId(), registration.getCourse().getTutor().getName(), 
        registration.getStudent().getId(), registration.getStudent().getName(), registration.getCourse().getId(), registration.getCourse().getCourseName());
    }
}
