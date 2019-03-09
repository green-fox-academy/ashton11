package com.greenfox.programmerfoxclub.controller;


import com.greenfox.programmerfoxclub.model.Fox;
import com.greenfox.programmerfoxclub.model.ListOfFoxes;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@org.springframework.stereotype.Controller
public class MainController {



    @RequestMapping(value = "/")
    public String mainPage(@ModelAttribute Fox fox){

        System.out.println(fox.getName());
        return "index";
    }

    @GetMapping(value = "/login")
    public String loginPage(Model model){
        model.addAttribute("fox", new Fox());
        return "login";
    }

    @PostMapping(value = "/login")
    public String loginToMain(@ModelAttribute Fox fox){
        return "index";
    }
}
