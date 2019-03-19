package com.greenfoxacademy.resting.controllers;

import com.greenfoxacademy.resting.models.Greeting;
import com.greenfoxacademy.resting.models.NoInputError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

  @GetMapping("/greeter")
  public Object greet(@RequestParam( value = "name", required = false) String name,
                      @RequestParam(value = "title", required = false) String title){
    if(name == null && title == null) {
      return new NoInputError("Please provide a name and a title!");
    }else if (name == null) {
      return new NoInputError("Please provide a name!");
    }else if (title == null) {
      return new NoInputError("Please provide a title!");
    }else{
      return new Greeting(name, title);
    }
  }
}