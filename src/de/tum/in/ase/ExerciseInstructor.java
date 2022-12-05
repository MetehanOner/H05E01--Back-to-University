package de.tum.in.ase;

import java.util.Objects;

public class ExerciseInstructor extends Participant {

    private Lecture lecture;

    public ExerciseInstructor(String firstName, String lastName, String tumID, Lecture lecture) {
        super(firstName, lastName, tumID);

        setLecture(lecture);

    }

    @Override
    public void attend(Lecture lecture) {

        if(Objects.equals(this.lecture.getId(), lecture.getId())){
            System.out.println(this.getName() +" tumID:"+ this.getTumID() +" already attends/holds the lecture.");
        } else {
            Student s = new Student(super.getFirstName(), super.getLastName(), super.getTumID());
            lecture.addParticipant(s);
        }

    }

    @Override
    public String toString() {
        return "Exercise Instructor " + super.getName();
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public Lecture getLecture() {
        return lecture;
    }
}
