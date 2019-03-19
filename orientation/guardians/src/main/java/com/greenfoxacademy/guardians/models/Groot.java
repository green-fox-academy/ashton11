package com.greenfoxacademy.guardians.models;

public class Groot {

  private int id;
  private String received;
  private String translated;

  public Groot(String received) {
    this.received = received;
  }

  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    translated = "I am Groot!";
    this.translated = translated;
  }
}
