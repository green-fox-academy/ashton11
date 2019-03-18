package com.greenfoxacademy.orientationtrialexam.service;

import com.greenfoxacademy.orientationtrialexam.repository.AlliasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlliasService {
  private AlliasRepository alliasRepository;

  @Autowired
  public AlliasService(AlliasRepository alliasRepository) {
    this.alliasRepository = alliasRepository;
  }
}
