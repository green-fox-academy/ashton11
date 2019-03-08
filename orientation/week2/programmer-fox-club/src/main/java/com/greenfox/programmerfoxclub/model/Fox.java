package com.greenfox.programmerfoxclub.model;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Fox {
    private String name;
    private List<Tricks> tricks;
    private String food;
    private String drink;


    public Fox(){
    }

    public Fox(String name){
        this.name = name;
        this.tricks = null;
        this.drink = null;
        this.food = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
