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

            if (getStudents().contains((Student) p)){
                int index = getStudents().indexOf((Student) p);
                System.out.println(getStudents().get(index).getName() +" tumID:"+ getStudents().get(index).getTumID() +" already attends/holds the lecture.");
            }

            //not related to amount of students interesting??
            getStudents().add((Student) p);

        } else if (p instanceof Tutor) {

            if (getTutors().contains((Tutor) p)){
                int index = getTutors().indexOf((Tutor) p);
                System.out.println(getTutors().get(index).getName() +" tumID:"+ getStudents().get(index).getTumID() +" already attends/holds the lecture.");
            }

            getTutors().add((Tutor) p);

        } else if (p instanceof ExerciseInstructor){

            if (getExerciseInstructors().contains((ExerciseInstructor) p)){
                int index = getExerciseInstructors().indexOf((ExerciseInstructor) p);
                System.out.println(getExerciseInstructors().get(index).getName() +" tumID:"+ getExerciseInstructors().get(index).getTumID() +" already attends/holds the lecture.");
            }

            getExerciseInstructors().add((ExerciseInstructor) p);

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
                addParticipant(participants.get(i));;
            }
        }

    }

    public void takePlace(){

        //place students
        getLectureHall().placeStudents(getStudents());

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
