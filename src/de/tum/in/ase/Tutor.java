package de.tum.in.ase;

import java.util.Objects;

public class Tutor extends Participant{

    private Lecture lecture;

    public Tutor(String firstName, String lastName, String tumID, Lecture lecture) {
        super(firstName, lastName, tumID);
        this.lecture = lecture;
    }

    @Override
    public void attend(Lecture lecture) {

        //if(Objects.equals(this.lecture.getId(), lecture.getId())){
        //    System.out.println(this.getName() +" tumID:"+ this.getTumID() +" already attends/holds the lecture.");
        //}
        //else {
            Student s = new Student(this.getFirstName(), this.getLastName(), this.getTumID());
            lecture.addParticipant(s);
        //}

    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public Lecture getLecture() {
        return lecture;
    }
}
