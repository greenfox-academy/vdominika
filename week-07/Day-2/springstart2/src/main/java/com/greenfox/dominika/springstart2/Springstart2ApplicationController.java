package com.greenfox.dominika.springstart2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Springstart2ApplicationController {

    @RequestMapping(value="/hello")
    @ResponseBody
    public String hello (){
        return "Hello World!";
    }
}
