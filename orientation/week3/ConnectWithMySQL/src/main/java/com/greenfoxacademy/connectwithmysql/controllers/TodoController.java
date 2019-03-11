package com.greenfoxacademy.connectwithmysql.controllers;

import com.greenfoxacademy.connectwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

    private TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @RequestMapping(value = {"/todo/list", "/todo/"} , method = RequestMethod.GET)
    //@ResponseBody
    public String list(Model model){
        model.addAttribute("Todos", todoRepository.findAll());
        return "todolist";
        //return "This is my first Todo";
    }

    @RequestMapping(value = "todo/searched")
    public String getActive(Model model, @RequestParam(name = "isActive") boolean isActive){
        System.out.println(todoRepository.findByDone(isActive));
        model.addAttribute("Todos", todoRepository.findByDone(!isActive));
        return "todolist";
    }

    @RequestMapping(value = "")
}
