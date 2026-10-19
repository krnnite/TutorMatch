package knitedev.TutorMatch.entity;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity 
@Table(name = "students")
public class Student {
    private long id;
    
    private String name;
    
    private LocalDate dayJoined;

    private String gradeLevel;

    private String topics;

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

    public LocalDate getDayJoined() {
        return dayJoined;
    }

    public void setDayJoined(LocalDate dayJoined) {
        this.dayJoined = dayJoined;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }
}
