package de.tum.in.ase;

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
                setCapacity(capacity/30);
                setCapacity(capacity);
            } else {
                capacity = capacity - temp;
                setRows(capacity/30);
                setCapacity(capacity);
            }

        }

        Student[][] rowList = new Student[30][getRows()];
        setRowsOfStudents(rowList);

    }

    public void placeStudents(List<Student> waitingStudents){

        System.out.println("Waiting students: " + waitingStudents.size());

        if(waitingStudents.size() > getCapacity()){
            System.out.println(getName() + " hall doesn't have enough places for all the students!");
            System.out.println("We can place only the first " +getCapacity()+ " out of "+waitingStudents.size()+" students.");

            for(int i = 0; i < getRows() ; i++) {
                for(int j = 0; j < 30; j++) {

                        getRowsOfStudents()[j][i] = waitingStudents.get(j);

                }
            }

            System.out.println(Arrays.deepToString(getRowsOfStudents()));

        } else if (waitingStudents.size() == getCapacity()) {

            for(int i = 0; i < getRows() ; i++) {
                for(int j = 0; j < 30; j++) {

                    getRowsOfStudents()[j][i] = waitingStudents.get(j);

                }
            }

            System.out.println(Arrays.deepToString(getRowsOfStudents()));

            System.out.println("All students are sitting in the lecture hall.");
        }



    }

    public void empty(){

    }

    @Override
    public String toString() {
        return

                getName() + " hall:\n" + "Row 1: " + getRowsOfStudents().toString();
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
