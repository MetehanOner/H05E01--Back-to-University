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

        if(p instanceof Student){

            for(int i = 0; i < getStudents().size(); i++){
                if (getStudents().get(i) == p){
                   System.out.println(getStudents().get(i).getName() +" tumID:"+ getStudents().get(i).getTumID() +" already attends/holds the lecture.");
                }
            }

            getStudents().add((Student) p);

        } else if (p instanceof Tutor) {

            for(int i = 0; i < getTutors().size(); i++){
                if (getTutors().get(i) == p){
                    System.out.println(getTutors().get(i).getName() +" tumID:"+ getTutors().get(i).getTumID() +" already attends/holds the lecture.");
                }
            }

            getTutors().add((Tutor) p);

        } else if (p instanceof ExerciseInstructor){

            for(int i = 0; i < getExerciseInstructors().size(); i++){
                if (getExerciseInstructors().get(i) == p){
                    System.out.println(getExerciseInstructors().get(i).getName() +" tumID:"+ getExerciseInstructors().get(i).getTumID() +" already attends/holds the lecture.");
                }
            }

            getExerciseInstructors().add((ExerciseInstructor) p);

        } else if (p instanceof Lecturer) {

            if(!(getLecturer()==null)) {
                System.out.println("This lecture already has a lecturer!");
            } else {
                setLecturer((Lecturer) p);
            }

        } else {
            System.out.println("No such participants allowed in this lecture!");
        }


    }

    public void addParticipants(List<Participant> participants){

        for(int i = 0; i < participants.size(); i++){
            if(participants.get(i) instanceof Student){
                addParticipant(participants.get(i));
            } else if (participants.get(i) instanceof Tutor) {
                addParticipant(participants.get(i));
            } else if (participants.get(i) instanceof ExerciseInstructor) {
                addParticipant(participants.get(i));;
            }
        }

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
