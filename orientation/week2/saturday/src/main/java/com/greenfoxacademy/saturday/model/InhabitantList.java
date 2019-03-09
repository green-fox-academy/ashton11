package com.greenfoxacademy.saturday.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InhabitantList {
    List<Inhabitant> inhabitants;

    public InhabitantList(){
        this.inhabitants = new ArrayList<>();
        initializeList();
    }

    public void initializeList(){
        Inhabitant micimacko = new Inhabitant("Micimackó", 4, Gender.MALE);
        inhabitants.add(micimacko);
        Inhabitant malacka = new Inhabitant("Malacka", 3, Gender.MALE);
        inhabitants.add(malacka);
    }

    public List<Inhabitant> getInhabitants() {
        return inhabitants;
    }

    public Inhabitant filterByID(int id){
        for (Inhabitant inhabitant:inhabitants) {
            if (inhabitant.getId() == id){
                return inhabitant;
            }
            }
        return null;
    }

    public void addInhabitant(Inhabitant inhabitant) {
        getInhabitants().add(inhabitant);
    }
}

