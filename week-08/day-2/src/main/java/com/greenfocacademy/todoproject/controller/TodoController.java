package com.greenfocacademy.todoproject.controller;

import com.greenfocacademy.todoproject.model.Todo;
import com.greenfocacademy.todoproject.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping ("/todo")
public class TodoController {

    @Autowired
    TodoRepo todoRepo;

    @RequestMapping({"/","/list"})
    public String list(Model model){
        model.addAttribute("todos", todoRepo.findAll());
        return "todo";
    }

    @GetMapping(value = "/create")
    public String loadCreate() {
        return "create";
    }

    @PostMapping(value = "/create")
    public String createTodo(@RequestParam String title) {
        todoRepo.save(new Todo(title));
        return "redirect:/todo/list";
    }
}
