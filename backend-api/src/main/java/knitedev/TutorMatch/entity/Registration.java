package knitedev.TutorMatch.entity;
import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

@Entity
@Table(name = "registrations")
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @PastOrPresent 
    @NotNull
    @Column(nullable = false) 
    private LocalDate dayRegistered;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false) 
    @JoinColumn(name = "student_id", nullable = false) 
    private Student student;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "course_id", nullable = false) 
    private Course course;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDayRegistered() {
        return dayRegistered;
    }

    public void setDayRegistered(LocalDate dayRegistered) {
        this.dayRegistered = dayRegistered;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
