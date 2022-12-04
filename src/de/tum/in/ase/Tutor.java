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

        Tutor t = new Tutor(getFirstName(), getLastName(), getTumID(), getLecture());

        for(int i=0; i< lecture.getTutors().size(); i++){
        }



        if(lecture.getTutors().size() == 0){
            lecture.addParticipant(t);
        } else {
            for(int i=0; i< lecture.getTutors().size(); i++){
                if(Objects.equals(lecture.getTutors().get(i).getTumID(), getTumID())){
                    lecture.addParticipant(t);
                }
            }

            Student s = new Student(getFirstName(), getLastName(), getTumID());
            lecture.addParticipant(s);

        }

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
