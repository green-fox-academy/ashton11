package com.greenfoxacademy.connectwithmysql;

import com.greenfoxacademy.connectwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectwithmysqlApplication {

    @Autowired
    private TodoRepository todoRepository;

    public ConnectwithmysqlApplication(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConnectwithmysqlApplication.class, args);
    }

}
