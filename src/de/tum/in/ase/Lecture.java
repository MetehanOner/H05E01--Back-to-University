package de.tum.in.ase;

import java.util.List;

public class Lecture {

    private String id;
    private String name;

    public Lecture(){
        setName(getName());
        setId(getId());
    }

    public void addParticipant(Participant p){

    };

    public void addParticipants(List<Participant> participants){

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
}
