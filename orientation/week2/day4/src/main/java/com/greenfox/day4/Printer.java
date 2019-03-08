package com.greenfox.day4;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {

    public void log(BlueBalls color) {
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + color.printColor() );
    }
}