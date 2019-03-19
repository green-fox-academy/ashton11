package com.greenfoxacademy.orientationtrialexam.controller;

import com.greenfoxacademy.orientationtrialexam.model.Alias;
import com.greenfoxacademy.orientationtrialexam.service.AliasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

  private AliasService aliasService;

  @Autowired
  public MainController(AliasService aliasService) {
    this.aliasService = aliasService;
  }

  @GetMapping("/")
  public String getMainPage(Model model){
    model.addAttribute("Alias", new Alias());

    return "index";
  }

  @PostMapping("/save-link")
  public ModelAndView saveAlias(Alias alias, ModelMap model){
    aliasService.saveAlias(alias);

  }
}
