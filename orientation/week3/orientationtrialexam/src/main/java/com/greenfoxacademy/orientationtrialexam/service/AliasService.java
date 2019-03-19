package com.greenfoxacademy.orientationtrialexam.service;

import com.greenfoxacademy.orientationtrialexam.model.Alias;
import com.greenfoxacademy.orientationtrialexam.repository.AliasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AliasService {
  private AliasRepository aliasRepository;

  @Autowired
  public AliasService(AliasRepository aliasRepository) {
    this.aliasRepository = aliasRepository;
  }

  public void saveAlias(Alias alias){
    aliasRepository.save(alias);
  }

  public boolean containsAlias(String name){
    return aliasRepository.findAliasByAliasNameExists(name);
  }
}
