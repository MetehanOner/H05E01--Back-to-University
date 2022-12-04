package de.tum.in.ase;

public class Student extends Participant {

    public Student(String firstName, String lastName, String tumID) {
        super(firstName, lastName, tumID);
    }

    @Override
    public void attend(Lecture lecture) {

        lecture.addParticipant(this);

    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public String getTumID() {
        return super.getTumID();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
