package knitedev.TutorMatch.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
@Table(name = "tutors")
public class Tutor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Size(max = 50) 
    private String name;
    
    @NotBlank 
    @Size(max = 50)
    private String username;

    @NotBlank 
    @Size(min = 8, max = 74)
    private String password;

    @PastOrPresent 
    @NotNull 
    private LocalDate dayJoined;

    @NotBlank
    @Size(max = 60)
    private String educationLevel;

    @NotBlank
    @Size(max = 1000)
    private String biography;

    public Tutor() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDate getDayJoined() {
        return dayJoined;
    }

    public void setDayJoined(LocalDate dayJoined) {
        this.dayJoined = dayJoined;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
