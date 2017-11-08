package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.*;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoublingController {

    @RequestMapping(value ="/doubling", method= RequestMethod.GET)
    public Doubling doubling (@RequestParam(value = "input") int input){
        Doubling doubling = new Doubling (input);
        return doubling;
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ErrorMessage error(){
        return new ErrorMessage("Please provide an input!");
    }
}
