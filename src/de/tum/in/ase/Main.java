package de.tum.in.ase;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //TODO create classes Participant, Lecturer, ExerciseInstructor, Tutor, Student according to UML diagrams (Hint: inheritance)
    /*Participant p1 = new Participant("Ali", "Veli", "00001") {
        @Override
        public void attend(Lecture lecture) {
            lecture.addParticipant(this);
        }
    };
    Participant p2 = new Participant("Ali", "Veli", "00002") {
        @Override
        public void attend(Lecture lecture) {
            lecture.addParticipant(this);
        }
    };
    Participant p3 = new Participant("Ali", "Veli", "00003") {
        @Override
        public void attend(Lecture lecture) {
            lecture.addParticipant(this);
        }
    };
    Participant p4 = new Participant("Ali", "Veli", "00004") {
        @Override
        public void attend(Lecture lecture) {
            lecture.addParticipant(this);
        }
    };

    Participant p5 = new Participant("Ali", "Veli", "00005") {
        @Override
        public void attend(Lecture lecture) {
            lecture.addParticipant(this);
        }
    };*/

    //Student s1 = new Student("ali", "veli", "4950");
    //Lecturer l1= new Lecturer("ahmet", "mete", "2345");
    //ExerciseInstructor e1 = new ExerciseInstructor("gery","gery", "1234");
    //Tutor t1 = new Tutor("red","red","0987",);


    //TODO create classes Lecture and LectureHall

    //TODO implement toString() methods

    //TODO implement methods addParticipant and addParticipants in Lecture

    //TODO implement openLecture() and closeLecture() in Lecturer

    //TODO implement methods in LectureHall

    //TODO implement method takePlace() in Lecture


    public static void main(String[] args){
        //TODO test your code here

    }


    //TODO implement methods generateStudents and generateTutors

    //TODO think of the most suitable access modifier for those helper methods

    private static List<Student> generateStudents(int amount){

        List<Student> sList = new ArrayList<>();

        String TUM_ID_STRING = "";
        for(int i = 0; i < amount; i++){
            TUM_ID_STRING = TUM_ID_STRING + i;
            Student s = new Student("Mete", "Oner", TUM_ID_STRING);
            sList.add(s);
        }

        return sList;
    }

    private static List<Tutor> generateTutors(int amount, Lecture lecture){

        List<Tutor> tList = new ArrayList<>();

        String TUM_ID_STRING = "";
        for(int i = 0; i < amount; i++){
            TUM_ID_STRING = TUM_ID_STRING + i;
            Tutor t = new Tutor("Mete", "Oner", TUM_ID_STRING, lecture);
            tList.add(t);
        }

        return tList;
    }


}
