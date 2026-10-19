package knitedev.TutorMatch.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;

@Entity
@Table(name = "tutors")
public class Tutor {
    private long id;

    private String name;
    
    private LocalDate dayJoined;

    private InstructionLevel instructionLevel;

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

    public LocalDate getDayJoined() {
        return dayJoined;
    }

    public void setDayJoined(LocalDate dayJoined) {
        this.dayJoined = dayJoined;
    }

    public InstructionLevel getInstructionLevel() {
        return instructionLevel;
    }

    public void setInstructionLevel(InstructionLevel instructionLevel) {
        this.instructionLevel = instructionLevel;
    }
}
