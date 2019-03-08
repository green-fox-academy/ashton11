package com.greenfox.programmerfoxclub.model;

import java.util.List;

public class ListOfFoxes {
    private List<Fox> foxes;

    public List<Fox> getFoxes() {
        return foxes;
    }

    public void setFoxes(List<Fox> foxes) {
        this.foxes = foxes;
    }

    public void addFoxes(Fox fox){
        foxes.add(fox);
    }
}
