package com.greenfox.springstart.controllers;

import com.greenfox.springstart.Greetings;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController

public class HelloRESTController {
    static AtomicLong counter = new AtomicLong(1);
    @RequestMapping
    public static Object greeting(@RequestParam String name){
        Greetings greeting = new Greetings(counter.addAndGet(1),name);
        return greeting;
    }

}
