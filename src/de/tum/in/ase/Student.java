package de.tum.in.ase;

public class Student extends Participant{

    protected Student(String firstName, String lastName, String tumID) {
        super(firstName, lastName, tumID);
    }

    @Override
    public void attend(Lecture lecture) {

    }
}
