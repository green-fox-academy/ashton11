package com.greenfoxacademy.reddit.model;


import com.greenfoxacademy.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
  @Id
  private String username;
  private String password;
  private PostService postService;

  @Autowired
  public User(PostService postService) {
    this.postService = postService;
  }
}
