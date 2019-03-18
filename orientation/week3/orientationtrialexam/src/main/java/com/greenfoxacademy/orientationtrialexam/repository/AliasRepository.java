package com.greenfoxacademy.orientationtrialexam.repository;

import com.greenfoxacademy.orientationtrialexam.model.Allias;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlliasRepository extends CrudRepository<Allias, Integer> {
}
