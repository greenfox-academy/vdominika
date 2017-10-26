package com.greenfox.dominika.springstart2.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloRESTController {


    @RequestMapping
    public String greeting() {
        return "Hello";
    }
}

