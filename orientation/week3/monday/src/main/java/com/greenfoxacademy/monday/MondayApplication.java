package com.greenfoxacademy.monday;

import com.greenfoxacademy.monday.models.Todo;
import com.greenfoxacademy.monday.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MondayApplication implements CommandLineRunner {

    private TodoRepository todoRepository;

    public MondayApplication(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(MondayApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
    }
}
