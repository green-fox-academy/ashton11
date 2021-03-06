package com.greenfoxacademy.saturday.model;

public class Inhabitant {

    private static int nextId = 0;

    private int id;
    private String name;
    private int age;
    private Gender gender;

    public Inhabitant(String name, int age, Gender gender) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Inhabitant(){
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = nextId++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

