package com.greenfox.day4;

import org.springframework.stereotype.Service;

@Service 
public class Red implements MyColor{

    @Override
    public String printColor() {
       return "It is red in color...";
    }
}
