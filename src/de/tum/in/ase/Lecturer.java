package de.tum.in.ase;

import java.util.List;

public class Lecturer extends Participant {

    private String title;

    private List<Lecture> lectures;

    protected Lecturer(String firstName, String lastName, String tumID, String title) {
        super(firstName, lastName, tumID);
        setTitle(title);

    }

    @Override
    public void attend(Lecture lecture) {

    }

    public void addLecture(Lecture lecture) {

        if(!(lecture.getLecturer() == null)){
            System.out.println("The lecture "+lecture.getName()+" is already held by another lecturer.");
        }

        getLectures().add(lecture);

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

    /* @Override
    public String toString() {
        return "Lecturer{" +
                "title='" + title + '\'' +
                '}';
    }*/
}
