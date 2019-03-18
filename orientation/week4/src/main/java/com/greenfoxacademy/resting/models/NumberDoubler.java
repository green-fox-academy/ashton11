package com.greenfoxacademy.resting.models;

public class NumberDoubler {
  private Integer result;
  private Integer received;

  public NumberDoubler(Integer received) {
      this.received = received;
      result = received * 2;
    }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public Integer getReceived() {
    return received;
  }

  public void setRecieved(Integer recieved) {
    this.received = recieved;
  }
}
