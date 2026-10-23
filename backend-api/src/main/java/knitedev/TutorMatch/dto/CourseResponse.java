package knitedev.TutorMatch.dto;
import knitedev.TutorMatch.entity.Course;

public record CourseResponse(
    long id,
    String courseName,
    String tutorName,
    String courseDescription
) {
    public static CourseResponse from (Course course) {
        return new CourseResponse(course.getId(), course.getCourseName(), course.getTutor().getName(), course.getCourseDescription());
    }
}
