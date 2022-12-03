package de.tum.in.ase;

public class ExerciseInstructor extends Participant {

    private Lecture lecture;

    protected ExerciseInstructor(String firstName, String lastName, String tumID, Lecture lecture) {
        super(firstName, lastName, tumID);
        setLecture(lecture);

    }

    @Override
    public void attend(Lecture lecture) {

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
