package de.tum.in.ase;

public class Tutor extends Participant{

    private Lecture lecture;

    protected Tutor(String firstName, String lastName, String tumID) {
        super(firstName, lastName, tumID);
    }

    @Override
    public void attend(Lecture lecture) {

    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public Lecture getLecture() {
        return lecture;
    }
}