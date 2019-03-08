package com.greenfox.programmerfoxclub.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Fox {
    private String name;
    private List<Tricks> tricks;


    public Fox(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
