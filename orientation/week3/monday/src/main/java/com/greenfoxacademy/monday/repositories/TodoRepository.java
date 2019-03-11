package com.greenfoxacademy.monday.repositories;

import com.greenfoxacademy.monday.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
