package knitedev.TutorMatch.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "registrations")
public class Registration {
    private long id;

    private long tutorId;
    
    private long studentId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTutorId() {
        return tutorId;
    }

    public void setTutorId(long tutorId) {
        this.tutorId = tutorId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

}
