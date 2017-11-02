package com.greenfocacademy.todoproject.controller;

import com.greenfocacademy.todoproject.model.Todo;
import com.greenfocacademy.todoproject.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/{id}/delete")
    public String deleteTodo(@PathVariable long id) {
        todoRepo.delete(id);
        return "redirect:/todo/list";
    }

    @GetMapping(value = "/{id}/edit")
    public String loadTodo(@PathVariable long id, Model model) {
        model.addAttribute("todo", todoRepo.findOne(id));
        return "edit";
    }

    @PostMapping(value = "/{id}/edit")
    public String editTodo(@PathVariable long id, @ModelAttribute Todo todo) {
        todoRepo.save(todo);
        return "redirect:/todo/list";
    }
}
