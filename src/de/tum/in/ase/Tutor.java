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

        if(lecture.getTutors().contains(this)){

            int index = this.lecture.getTutors().indexOf(this);
            int indices = lecture.getTutors().indexOf(this);

            if(this.lecture.getTutors().get(index) == lecture.getTutors().get(indices)){
                System.out.println(lecture.getExerciseInstructors().get(indices).getName() +" tumID:"+ lecture.getExerciseInstructors().get(indices).getTumID() +" already attends/holds the lecture.");
            } else {
                Student s = new Student(this.getFirstName(), this.getLastName(), this.getTumID());
                lecture.addParticipant(s);
            }

        } else {
            Student s = new Student(this.getFirstName(), this.getLastName(), this.getTumID());
            lecture.addParticipant(s);
        }

        /*if(lecture.getTutors().contains(this) == this.lecture.getTutors().contains(this)){
            int indices = lecture.getTutors().indexOf(this);
            System.out.println(lecture.getTutors().get(indices).getName() +" tumID:"+ lecture.getTutors().get(indices).getTumID() +" already attends/holds the lecture.");
        } else {
            Student s = new Student(this.getFirstName(), this.getLastName(), this.getTumID());
            lecture.addParticipant(s);
        }*/

        /*
        if(lecture.getTutors().contains(this.lecture.getTutors().)){
            int indices = lecture.getTutors().indexOf(this);
            System.out.println(lecture.getTutors().get(indices).getName() +" tumID:"+ lecture.getTutors().get(indices).getTumID() +" already attends/holds the lecture.");
        } else {
            Student s = new Student(this.getFirstName(), this.getLastName(), this.getTumID());
            lecture.addParticipant(s);
        }*/

    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public Lecture getLecture() {
        return lecture;
    }
}
