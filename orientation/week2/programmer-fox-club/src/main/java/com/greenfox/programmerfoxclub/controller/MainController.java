package com.greenfox.programmerfoxclub.controller;


import com.greenfox.programmerfoxclub.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
public class MainController {
    @Autowired
    private Fox fox;

    @RequestMapping(value = "/")
    public String mainPage(Model model){
        model.addAttribute("Fox", fox);
        return "index";
    }
}
