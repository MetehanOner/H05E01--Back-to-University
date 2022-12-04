package de.tum.in.ase;

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
            setCapacity(90);
        } else {
            int temp = capacity % 30;

            if(temp == 0){
                setCapacity(capacity);
            } else {
                capacity = capacity - temp;
                setCapacity(capacity);
            }

        }

    }

    public void placeStudents(List<Student> waitingStudents){

        System.out.println("Waiting students: " + waitingStudents.size());

    }

    public void empty(){

    }

    @Override
    public String toString() {
        return super.toString();
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
