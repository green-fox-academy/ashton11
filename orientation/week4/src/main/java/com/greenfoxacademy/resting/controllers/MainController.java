package com.greenfoxacademy.resting.controllers;


import com.greenfoxacademy.resting.models.NumberDoubler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

  @GetMapping("/")
  public String getIndex(){
    return "index";
  }



}
