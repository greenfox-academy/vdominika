package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.repository.RedditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class RedditController {

    @Autowired
    RedditRepo redditRepo;


}
