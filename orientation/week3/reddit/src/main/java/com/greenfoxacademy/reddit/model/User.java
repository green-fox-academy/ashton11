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
  private String name;


  public User() {
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostService getPostService() {
    return postService;
  }

  public void setPostService(PostService postService) {
    this.postService = postService;
  }
}
