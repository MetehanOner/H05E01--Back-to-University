package de.tum.in.ase;

public abstract class Participant {
    private String firstName;
    private String lastName;
    private String tumID;

    protected Participant(String firstName, String lastName, String tumID){
        setFirstName(firstName);
        setLastName(lastName);
        setTumID(tumID);
    }

    public String getName(){
        return getFirstName() +" "+ getLastName();
    }

    public abstract void attend(Lecture lecture);

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getTumID() {
        return tumID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTumID(String tumID) {
        this.tumID = tumID;
    }
}
