package knitedev.TutorMatch.entity;
import jakarta.persistence.*;

@Entity 
@Table(name = "reviews")
public class Review {
    private long id;
    
    private float rating;
    
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
