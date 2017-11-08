package com.greenfoxacademy.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @RequestMapping({"/"})
    public String list() {
        return "index";
    }

}


