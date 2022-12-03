package de.tum.in.ase;

import java.util.List;

public class Lecturer extends Participant{

    private String title;

    private List<Lecture> lectures;

    protected Lecturer(String firstName, String lastName, String tumID) {
        super(firstName, lastName, tumID);
        setTitle(getTitle());
    }

    @Override
    public void attend(Lecture lecture) {

    }

    public void addLecture(Lecture lecture) {

    }

    public void openLecture(Lecture lecture) {

    }

    public void closeLecture(Lecture lecture){

    }

    @Override
    public String toString() {
        return super.toString();
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
