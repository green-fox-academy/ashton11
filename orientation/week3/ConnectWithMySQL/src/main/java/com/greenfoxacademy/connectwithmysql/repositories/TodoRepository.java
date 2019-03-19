package com.greenfoxacademy.connectwithmysql.repositories;

import com.greenfoxacademy.connectwithmysql.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findByDone(boolean isDone);

    void deleteById(Long Id);
}
