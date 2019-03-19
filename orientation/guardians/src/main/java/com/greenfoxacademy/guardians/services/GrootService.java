package com.greenfoxacademy.guardians.services;

import com.greenfoxacademy.guardians.models.Groot;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrootService {
  List<Groot> groots;

  public GrootService(List<Groot> groots) {
    this.groots = groots;
  }

  public void addGroot(Groot groot){
    groots.add(groot);
  }

  public Groot getGroot(int id){
  }

}
