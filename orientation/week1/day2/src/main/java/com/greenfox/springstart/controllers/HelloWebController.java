package com.greenfox.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
AtomicLong counter2 = new AtomicLong(1);
    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", " World");
        model.addAttribute("counter", "This site was loaded " + counter2.getAndAdd(1) + " times since last server start" );
        return "greeting";
    }
}
