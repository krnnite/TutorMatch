package knitedev.TutorMatch.dto;
import knitedev.TutorMatch.entity.Review;

public record ReviewResponse(
    long id,
    long courseId,
    String courseName,
    long studentId,
    String studentName,
    int rating,
    String description
) {
    public static ReviewResponse from (Review review) {
        return new ReviewResponse(review.getId(), review.getCourse().getId(), review.getCourse().getCourseName(), review.getStudent().getId(), review.getStudent().getName(), review.getRating(), review.getDescription());
    }
}
