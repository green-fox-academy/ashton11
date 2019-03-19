package com.greenfoxacademy.guardians.controller;

import com.greenfoxacademy.guardians.services.GrootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @Autowired
  GrootService grootService;

  public GuardianController(GrootService grootService) {
    this.grootService = grootService;
  }

  @GetMapping("/groot")
  public Object getGroot(@RequestParam("message")String somemessage){

    return somemessage;
  }
}
