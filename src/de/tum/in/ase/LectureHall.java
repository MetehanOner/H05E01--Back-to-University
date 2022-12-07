package de.tum.in.ase;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LectureHall {

    private String name;
    private int capacity;
    private int rows;
    private Student[][] rowsOfStudents;

    public LectureHall(String name, int capacity){

        setName(name);

        if(capacity <= 90){
            setRows(3);
            setCapacity(90);
        } else {
            int temp = capacity % 30;

            if(temp == 0){
                setRows(capacity/30);
                setCapacity(capacity);
            } else {
                capacity = capacity - temp;
                setRows(capacity/30);
                setCapacity(capacity);
            }

        }

        int place = 30;
        Student[][] rowList = new Student[rows][place];
        setRowsOfStudents(rowList);

    }

    public void placeStudents(List<Student> waitingStudents){

        System.out.println("Waiting students: " + waitingStudents.size());

        int corner;
        if(waitingStudents.size() > capacity){
            System.out.println(getName() + " hall doesn't have enough places for all the students!");
            System.out.println("We can place only the first " +getCapacity()+ " out of "+waitingStudents.size()+" students.");
            corner = capacity;

            for(int i = 0; i < corner ; i++) {
                getRowsOfStudents()[i/30][i%30] = waitingStudents.get(i);
            }

        } else {
            corner = waitingStudents.size();

            for(int i = 0; i < corner ; i++) {
                getRowsOfStudents()[i/30][i%30] = waitingStudents.get(i);
            }

            System.out.println("All students are sitting in the lecture hall.");
        }

        System.out.print(this.toString());

    }

    public void empty(){


        for(int i = 0; i < getCapacity() ; i++) {
            getRowsOfStudents()[i/30][i%30] = null;
        }

    }

    @Override
    public String toString() {

        StringBuilder hall = new StringBuilder(getName() + " hall:\n");
        int place = 30;

        for (int i=0; i < rows; i++) {
            hall.append("Row ").append(i + 1).append(": ");
            for (int j=0; j < rowsOfStudents[i].length; j++) {
                if (!(rowsOfStudents[i][j]==null)){
                    hall.append("[").append(rowsOfStudents[i][j].getName()).append("]");
                }
                else {
                    hall.append("[]");
                }
            }
            if (!(i == rows-1)){
                hall.append("\n");
            }
        }

        return String.valueOf(hall);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setRowsOfStudents(Student[][] rowsOfStudents) {
        this.rowsOfStudents = rowsOfStudents;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRows() {
        return rows;
    }

    public Student[][] getRowsOfStudents() {
        return rowsOfStudents;
    }
}
