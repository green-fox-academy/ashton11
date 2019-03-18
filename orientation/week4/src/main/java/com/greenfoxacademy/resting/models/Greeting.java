package com.greenfoxacademy.resting.models;

public class Greeting extends Greet{
  private String welcome_message;

  public Greeting(String name, String title) {
    super(name, title);
    welcome_message = "Oh, hi there " + name + ", my dear " + title + "!" ;
  }

  public String getWelcome_message() {
    return welcome_message;
  }
}
