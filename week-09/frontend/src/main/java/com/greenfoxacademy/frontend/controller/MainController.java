package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.Doubling;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @RequestMapping({"/"})
    public String list() {
        return "index";
    }
}


