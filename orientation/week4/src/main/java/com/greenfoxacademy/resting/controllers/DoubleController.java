package com.greenfoxacademy.resting.controllers;

import com.greenfoxacademy.resting.models.NoInputError;
import com.greenfoxacademy.resting.models.NumberDoubler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoubleController {

  @GetMapping("/doubling")
  public Object doubler(@RequestParam(name = "input", required = false) Integer input){
    if (input == null){
      return new NoInputError("Please provide an input!");
    }else {
      System.out.println("Output");
      return new NumberDoubler(input);
    }
  }
}
