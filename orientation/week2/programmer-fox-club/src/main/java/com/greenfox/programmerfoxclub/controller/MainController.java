package com.greenfox.programmerfoxclub.controller;


import com.greenfox.programmerfoxclub.model.Fox;
import com.greenfox.programmerfoxclub.model.ListOfFoxes;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@org.springframework.stereotype.Controller
public class MainController {
    private ListOfFoxes listOfFoxes;
    public MainController(){
         listOfFoxes = new ListOfFoxes();
    }

    @RequestMapping(value = "/")
    public String mainPage(Model model,@RequestParam(name = "nameSetterForFox", defaultValue = "Mr.Fox") String name){
        model.addAttribute("name", name);
        System.out.println(listOfFoxes.getFoxes());
        return "index";
    }

    @GetMapping(value = "/login")
    public String loginPage(){
        return "login";
    }

    @PostMapping(value = "/login")
    public String loginToMain(Model model,@RequestParam(name = "nameSetterForFox", defaultValue = "Mr.Fox") String name){
        listOfFoxes.addFoxes(new Fox(name));
        model.addAttribute("name", name);
        return "index";
    }
}
