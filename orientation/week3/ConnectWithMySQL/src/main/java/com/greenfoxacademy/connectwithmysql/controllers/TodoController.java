package com.greenfoxacademy.connectwithmysql.controllers;

import com.greenfoxacademy.connectwithmysql.models.Todo;
import com.greenfoxacademy.connectwithmysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;

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
        model.addAttribute("Todos", todoRepository.findByDone(!isActive));
        return "todolist";
    }

    @GetMapping(value = "todo/add")
    public String addTodo(Model model){
        model.addAttribute("Todo", new Todo());
        model.addAttribute("radioOptions", new ArrayList<>(Arrays.asList("true", "false")));
        return "todo_add";
    }

    @PostMapping(value = "todo/add")
    public String postAddTodo(@ModelAttribute(name = "Todo")Todo todo){
        System.out.println(todo);
        todoRepository.save(todo);
        return "redirect:/todo/list";
    }
}
