package com.greenfoxacademy.guardians.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public Object getGroot(@RequestParam("message")String somemessage){
    return somemessage;
  }
}
