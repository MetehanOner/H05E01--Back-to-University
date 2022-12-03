package de.tum.in.ase;

public class Lecturer extends Participant{

    private String title;

    protected Lecturer(String firstName, String lastName, String tumID) {
        super(firstName, lastName, tumID);
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

    /* @Override
    public String toString() {
        return "Lecturer{" +
                "title='" + title + '\'' +
                '}';
    }*/
}
