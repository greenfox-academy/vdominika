package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.RedditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class RedditController {

    @Autowired
    RedditRepo redditRepo;

    @RequestMapping({"","/","/posts"})
    public String list(Model model){
        model.addAttribute("posts", redditRepo.findAll());
        return "posts";
    }

    @GetMapping(value = "/add")
    public String loadCreate() {
        return "add";
    }

    @PostMapping(value = "/add")
    public String createTodo(@RequestParam String content) {
        redditRepo.save(new Post(content));
        return "redirect:/posts/";
    }

    @GetMapping(value = "/{id}/edit")
    public String loadTodo(@PathVariable long id, Model model) {
        model.addAttribute("posts", redditRepo.findOne(id));
        return "posts";
    }

    @PostMapping(value = "/{id}/edit")
    public String editTodo(@PathVariable long id, @ModelAttribute Post post) {
        redditRepo.save(post);
        return "redirect:/posts/";
    }
}
