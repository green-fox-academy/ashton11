package com.greenfox.day4;

import org.springframework.stereotype.Service;

@Service
public class BlueBalls extends Color implements MyColor{
    public BlueBalls(){
        this.color = "blue";
    }
    @Override
    public String printColor() {
        return "My balls are blue...";
    }
}
