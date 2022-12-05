package de.tum.in.ase;

import java.util.Objects;

public class ExerciseInstructor extends Participant {

    private Lecture lecture;

    public ExerciseInstructor(String firstName, String lastName, String tumID, Lecture lecture) {
        super(firstName, lastName, tumID);

        setLecture(lecture);

    }

    @Override
    public void attend(Lecture lecture) {

        if(lecture.getExerciseInstructors().contains(this) == this.lecture.getExerciseInstructors().contains(this)){
            int indices = lecture.getExerciseInstructors().indexOf(this);
            System.out.println(lecture.getExerciseInstructors().get(indices).getName() +" tumID:"+ lecture.getExerciseInstructors().get(indices).getTumID() +" already attends/holds the lecture.");
        } else {
            Student s = new Student(this.getFirstName(), this.getLastName(), this.getTumID());
            lecture.addParticipant(s);
        }

        /*if(lecture.getExerciseInstructors().contains(this)){
            int indicators = lecture.getExerciseInstructors().indexOf(this);
            System.out.println(lecture.getExerciseInstructors().get(indicators).getName() +" tumID:"+ lecture.getExerciseInstructors().get(indicators).getTumID() +" already attends/holds the lecture.");
        } else {
            Student s = new Student(this.getFirstName(), this.getLastName(), this.getTumID());
            lecture.addParticipant(s);
        }*/

    }

    @Override
    public String toString() {
        return "Exercise Instructor " + super.getName();
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public Lecture getLecture() {
        return lecture;
    }
}
