package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.service.PostService;
import com.greenfoxacademy.reddit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RedditController {

  private PostService postService;
  private UserService userService;

  @Autowired
  public RedditController(PostService postService, UserService userService) {
    this.postService = postService;
    this.userService = userService;
  }

  @GetMapping
  public String getMainPage(@RequestParam(name = "username", required = false) String username,
                            @RequestParam(name = "password", required = false) String password){
    return "index";
  }

  @GetMapping(value = "/login")
  public String getLoginPage(){

    return "login_page";
  }

  @PostMapping(value = "/login")
  public String postLoginPage(@RequestParam(name = "username") String username,
                              @RequestParam(name = "password") String password){
    return "redirect:/main";
  }

  @GetMapping("/submit")
  public String getSubmitPage(){

    return "submit_page";
  }

  @PostMapping("/submit")
  public String postAdding(){

    return "redirect:/main";
  }

}
