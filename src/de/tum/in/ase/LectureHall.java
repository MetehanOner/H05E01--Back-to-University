package de.tum.in.ase;

import java.util.List;

public class LectureHall {

    private String name;
    private int capacity;
    private int rows;
    private Student[][] rowsOfStudents;

    public LectureHall(){

    }

    public void placeStudent(List<Student> waitingStudents){

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
