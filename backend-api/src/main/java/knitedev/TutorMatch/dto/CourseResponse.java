package knitedev.TutorMatch.dto;
import knitedev.TutorMatch.entity.Course;

public record CourseResponse(
    String courseName,
    String courseDescription,
    String tutorName
) {
    public static CourseResponse from (Course course) {
        return new CourseResponse(course.getCourseName(), course.getCourseDescription(), course.getTutorName());
    }
}
