package knitedev.TutorMatch.dto;
import knitedev.TutorMatch.entity.Review;

public record ReviewResponse(
    float rating,
    String description
) {
    public static ReviewResponse from (Review review) {
        return new ReviewResponse(review.getRating(), review.getDescription());
    }
}
