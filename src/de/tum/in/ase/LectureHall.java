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
                setRows(capacity/30);
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

        int corner;
        if(waitingStudents.size() > getCapacity()){
            System.out.println(getName() + " hall doesn't have enough places for all the students!");
            System.out.println("We can place only the first " +getCapacity()+ " out of "+waitingStudents.size()+" students.");
            corner = getCapacity();
        } else {
            corner = waitingStudents.size();
            System.out.println("All students are sitting in the lecture hall.");
        }

        for(int i = 0; i < corner ; i++) {
            getRowsOfStudents()[i%30][i/30] = waitingStudents.get(i);
        }

        System.out.println(this.toString());

    }

    public void empty(){

    }

    @Override
    public String toString() {

        String hall = ""; //helloworld

        for (int i=0; i<getRows(); i++){
            hall += "Row "+(i+1)+": ";
            for (int j=0; j<30; j++){
                hall += "["+ getRowsOfStudents()[j][i].getName() + "]" ;
            }
            hall += "\n";
        }

        return hall;

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
