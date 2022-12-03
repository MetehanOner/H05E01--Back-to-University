package de.tum.in.ase;

public class ExerciseInstructor extends Participant {

    private Lecture lecture;

    protected ExerciseInstructor(String firstName, String lastName, String tumID) {
        super(firstName, lastName, tumID);
    }

    @Override
    public void attend(Lecture lecture) {

    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public Lecture getLecture() {
        return lecture;
    }
}
