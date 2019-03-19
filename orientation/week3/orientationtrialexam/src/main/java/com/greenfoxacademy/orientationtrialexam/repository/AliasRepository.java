package com.greenfoxacademy.orientationtrialexam.repository;

import com.greenfoxacademy.orientationtrialexam.model.Alias;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AliasRepository extends CrudRepository<Alias, Integer> {

  boolean findAliasByAliasNameExists(String name);
}
