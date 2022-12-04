package de.tum.in.ase;

import java.util.ArrayList;
import java.util.List;

public class Lecture {

    private String id;
    private String name;

    private List<Student> students;

    private List<Tutor> tutors;

    private List<ExerciseInstructor> exerciseInstructors;

    private Lecturer lecturer;

    private LectureHall lectureHall;

    public Lecture(String id, String name, Lecturer lecturer, LectureHall lectureHall){
        setId(id);
        setName(name);
        setLecturer(lecturer);
        setLectureHall(lectureHall);

        List<Student> sList = new ArrayList<>();
        setStudents(sList);

        List<Tutor> tList = new ArrayList<>();
        setTutors(tList);

        List<ExerciseInstructor> eList = new ArrayList<>();
        setExerciseInstructors(eList);

    }

    public void addParticipant(Participant p){

        /*if(p instanceof Student){
            getStudents().add((Student) p);
        } else if (p instanceof Tutor) {
            getTutors().add((Tutor) p);
        } else if (p instanceof ExerciseInstructor){
            getExerciseInstructors().add((ExerciseInstructor) p);
        }*/



    }

    public void addParticipants(List<Participant> participants){



    }

    public void takePlace(){

    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setExerciseInstructors(List<ExerciseInstructor> exerciseInstructors) {
        this.exerciseInstructors = exerciseInstructors;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setTutors(List<Tutor> tutors) {
        this.tutors = tutors;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public List<ExerciseInstructor> getExerciseInstructors() {
        return exerciseInstructors;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Tutor> getTutors() {
        return tutors;
    }

    public void setLectureHall(LectureHall lectureHall) {
        this.lectureHall = lectureHall;
    }

    public LectureHall getLectureHall() {
        return lectureHall;
    }
}
