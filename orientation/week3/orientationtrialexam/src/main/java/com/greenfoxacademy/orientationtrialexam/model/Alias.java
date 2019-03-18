package com.greenfoxacademy.orientationtrialexam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Allias {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String url;
  private String allias;
  private int secretCode;
  private int hitCount;

  public Allias() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getAllias() {
    return allias;
  }

  public void setAllias(String allias) {
    this.allias = allias;
  }

  public int getSecretCode() {
    return secretCode;
  }

  public void setSecretCode(int secretCode) {
    this.secretCode = secretCode;
  }

  public int getHitCount() {
    return hitCount;
  }

  public void setHitCount(int hitCount) {
    this.hitCount = hitCount;
  }
}
