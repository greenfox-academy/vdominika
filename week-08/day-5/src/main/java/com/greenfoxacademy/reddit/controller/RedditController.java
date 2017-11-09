package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.RedditRepo;
import com.greenfoxacademy.reddit.service.PostProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class RedditController {

    @Autowired
    RedditRepo redditRepo;

    @Autowired
    PostProvider postProvi;

    @RequestMapping({"","/","/posts"})
    public String list(Model model){
        model.addAttribute("posts", redditRepo.findAll());
        return "posts";
    }

    @GetMapping(value = "/create")
    public String loadCreate() {
        return "create";
    }

    @PostMapping(value = "/create")
    public String createPost(@RequestParam String content) {
        redditRepo.save(new Post(content));
        return "redirect:/posts/";
    }

    @GetMapping({"","/","posts"})
    public String postList(Model model){
        model.addAttribute("posts", redditRepo.findAllByOrderByScoreDesc());
        return "posts";
    }

    @GetMapping(value = "/{id}/upVote")
    public String upVote (@PathVariable Long id){
        postProvi.upVote(id);
        return "redirect:/posts/";
    }

    @GetMapping(value = "/{id}/downVote")
    public String downVote (@PathVariable Long id){
        postProvi.downVote(id);
        return "redirect:/posts/";
    }

    @GetMapping(value = "/{id}/edit")
    public String loadPost(@PathVariable Long id, Model model) {
        model.addAttribute("posts", redditRepo.findOne(id));
        return "posts";
    }

    @PostMapping(value = "/{id}/edit")
    public String editPost(@PathVariable long id, @ModelAttribute Post post) {
        redditRepo.save(post);
        return "redirect:/posts/";
    }
}
