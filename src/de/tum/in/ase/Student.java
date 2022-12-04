package de.tum.in.ase;

public class Student extends Participant {

    public Student(String firstName, String lastName, String tumID) {
        super(firstName, lastName, tumID);
    }

    @Override
    public void attend(Lecture lecture) {

        Student s = new Student(getFirstName(), getLastName(), getTumID());
        lecture.addParticipant(s);

    }
}
