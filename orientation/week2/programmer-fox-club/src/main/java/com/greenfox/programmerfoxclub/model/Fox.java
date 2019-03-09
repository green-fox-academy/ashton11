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

    public List<Tricks> getTricks() {
        return tricks;
    }

    public void setTricks(List<Tricks> tricks) {
        this.tricks = tricks;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
