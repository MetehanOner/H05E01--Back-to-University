package de.tum.in.ase;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

        if(p instanceof Student){

            if (students.contains((Student) p)){
                int index = students.indexOf((Student) p);
                System.out.println(students.get(index).getName() +" tumID:"+ students.get(index).getTumID() +" already attends/holds the lecture.");
            } else {

                //not related to amount of students interesting??
                students.add((Student) p);

            }

        } else if (p instanceof Tutor) {

            if (tutors.contains((Tutor) p)){
                int index = tutors.indexOf((Tutor) p);
                System.out.println(tutors.get(index).getName() +" tumID:"+ tutors.get(index).getTumID() +" already attends/holds the lecture.");
            } else {
                tutors.add((Tutor) p);
            }

        } else if (p instanceof ExerciseInstructor){

            if (exerciseInstructors.contains((ExerciseInstructor) p)){
                int index = exerciseInstructors.indexOf((ExerciseInstructor) p);
                System.out.println(exerciseInstructors.get(index).getName() +" tumID:"+ exerciseInstructors.get(index).getTumID() +" already attends/holds the lecture.");
            } else {
                exerciseInstructors.add((ExerciseInstructor) p);
            }

        } else if (p instanceof Lecturer) {

            if(!(getLecturer() == null)) {
                System.out.println("This lecture already has a lecturer!");
            } else {
                setLecturer((Lecturer) p);
            }

        } else {
            System.out.println("No such participants allowed in this lecture!");
        }

    }

    public void addParticipants(List<Participant> participants){

        for(int i = 0; i < participants.size(); i++) {
            if(participants.get(i) instanceof Student){
                addParticipant(participants.get(i));
            } else if (participants.get(i) instanceof Tutor) {
                addParticipant(participants.get(i));
            } else if (participants.get(i) instanceof ExerciseInstructor) {
                addParticipant(participants.get(i));
            } else if (participants.get(i) instanceof Lecturer){
                addParticipant(participants.get(i));
            } else {
                System.out.println("No such participants allowed in this lecture!");
            }
        }

    }

    public void takePlace(){

        //place students
        getLectureHall().placeStudents(students);

        getLecturer().openLecture(this);

        getLecturer().closeLecture(this);

        getLectureHall().empty();

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
