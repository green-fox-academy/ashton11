package com.greenfoxacademy.orientationtrialexam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Random;

@Entity
public class Alias {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String url;
  private String aliasName;
  private String secretCode;
  private int hitCount;

  public Alias() {
    this.secretCode = String.format( "%04d" ,  new Random().nextInt(10000));
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

  public String getAliasName() {
    return aliasName;
  }

  public void setAliasName(String aliasName) {
    this.aliasName = aliasName;
  }

  public String getSecretCode() {
    return secretCode;
  }

  public void setSecretCode(String secretCode) {
    this.secretCode = secretCode;
  }

  public int getHitCount() {
    return hitCount;
  }

  public void setHitCount(int hitCount) {
    this.hitCount = hitCount;
  }
}
