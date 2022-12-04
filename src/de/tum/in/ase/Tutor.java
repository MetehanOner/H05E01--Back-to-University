package de.tum.in.ase;

import java.util.Objects;

public class Tutor extends Participant{

    private Lecture lecture;

    public Tutor(String firstName, String lastName, String tumID, Lecture lecture) {
        super(firstName, lastName, tumID);
        setLecture(lecture);
    }

    @Override
    public void attend(Lecture lecture) {

        lecture.addParticipant(this);

    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public Lecture getLecture() {
        return lecture;
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getTumID() {
        return super.getTumID();
    }
}
