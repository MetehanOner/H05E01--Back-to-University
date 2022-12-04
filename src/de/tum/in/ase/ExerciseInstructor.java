package de.tum.in.ase;

import java.util.Objects;

public class ExerciseInstructor extends Participant {

    //private Lecture lecture;

    public ExerciseInstructor(String firstName, String lastName, String tumID/*, Lecture lecture*/) {
        super(firstName, lastName, tumID);

        //setLecture(lecture);

    }

    @Override
    public void attend(Lecture lecture) {

        for(int i=0; i< lecture.getExerciseInstructors().size(); i++){
            if(Objects.equals(lecture.getExerciseInstructors().get(i).getTumID(), super.getTumID())){
                lecture.addParticipant(this);
            }
        }

        Student s = new Student(this.getFirstName(), this.getLastName(), this.getTumID());
        lecture.addParticipant(s);

    }

    @Override
    public String toString() {
        return "Exercise Instructor " + super.getName();
    }

    /*public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public Lecture getLecture() {
        return lecture;
    }*/
}
