package com.company.animal;

public class Animal {
    String name;
    int hunger;
    int thirst;



    public Animal(String name) {
        this.name = name;
        hunger = 50;
        thirst = 50;
    }
    public void eat () {
            hunger--;
    }
    public void drink () {
            thirst--;
    }
    public void play () {
            hunger++;
            thirst++;
    }
    public void printStats () {
            System.out.println(name + "'s statistics:" + "\n Hunger: " + hunger + "\n Thirst: " + thirst);
    }

}
