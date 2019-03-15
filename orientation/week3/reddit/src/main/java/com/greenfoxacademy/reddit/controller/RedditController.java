package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.service.PostService;
import com.greenfoxacademy.reddit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RedditController {

  private PostService postService;
  private UserService userService;

  @Autowired
  public RedditController(PostService postService, UserService userService) {
    this.postService = postService;
    this.userService = userService;
  }

  @GetMapping("/main")
  public String getMainPage(@RequestParam(name = "username", required = false) String username,
                            @RequestParam(name = "password", required = false) String password,
                            Model model){
    model.addAttribute("posts", postService.getTop10TrendingPosts());
    model.addAttribute("user", username);
    return "index";
  }

  @GetMapping("/login")
  public String getLoginPage(){

    return "login_page";
  }

  @PostMapping("/login")
  public String login(@RequestParam(name = "username") String username,
                      @RequestParam(name = "password") String password){
    return "redirect:/main";
  }

  @GetMapping("/submit")
  public String getSubmitPage(Model model){
    model.addAttribute("Post", new Post());
    return "submit_page";
  }

  @PostMapping("/submit")
  public String postAdding(@ModelAttribute(name = "Post") Post post){
    postService.addPost(post);
    return "redirect:/main";
  }

  @GetMapping("/upvote/{id}")
  public String upvotePostGet(@PathVariable(name = "id") int id){
    postService.upvotePost(id);
    return "redirect:/main";
  }

  @GetMapping("/post/{title}")
  public String getPostWithText(@PathVariable(name = "title")String title, Model model){
    model.addAttribute("post",postService.getPostByTitle(title));
    return "post_view";
  }
}