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

        for(int i=0; i< lecture.getTutors().size(); i++) {
            if(Objects.equals(lecture.getTutors().get(i).getTumID(), super.getTumID())){
                lecture.addParticipant(this);
            }
        }

        Student s = new Student(this.getFirstName(), this.getLastName(), this.getTumID());
        lecture.addParticipant(s);

    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public Lecture getLecture() {
        return lecture;
    }
}
