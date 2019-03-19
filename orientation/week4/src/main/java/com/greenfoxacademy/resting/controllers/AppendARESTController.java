package com.greenfoxacademy.resting.controllers;

import com.greenfoxacademy.resting.models.AppendA;
import com.greenfoxacademy.resting.models.NoInputError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendARESTController {

  @GetMapping("/appenda/{appendable}")
  public Object appendA(@PathVariable(name = "appendable") String appendable){
    return new AppendA(appendable);
  }
}
