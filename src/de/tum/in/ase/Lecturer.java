package de.tum.in.ase;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lecturer extends Participant {

    private String title;

    private List<Lecture> lectures;

    public Lecturer(String firstName, String lastName, String tumID, String title) {
        super(firstName, lastName, tumID);
        setTitle(title);

        List<Lecture> lList = new ArrayList<>();
        setLectures(lList);
    }

    @Override
    public void attend(Lecture lecture) {

        lecture.addParticipant(this);

    }

    public void addLecture(Lecture lecture) {

        if(lecture.getLecturer() == null){

            getLectures().add(lecture);

        }

        System.out.println("The lecture "+lecture.getName()+" is already held by another lecturer.");

    }

    public void openLecture(Lecture lecture) {

        System.out.println("Welcome to the lecture "+lecture.getName()+"!"+ "I'm Prof. "+lecture.getLecturer()+".");

    }

    public void closeLecture(Lecture lecture){

        System.out.println("This is all for today. See you next week!");

    }

    @Override
    public String toString() {
        return getTitle() + super.getName();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }

}
