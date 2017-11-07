package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.DoUntil;
import com.greenfoxacademy.frontend.model.ErrorMessage;
import com.greenfoxacademy.frontend.model.Until;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilController {

    @RequestMapping(value ="/dountil/{what}", method= RequestMethod.POST)
    public DoUntil dountil (@PathVariable("what") String what, @RequestBody Until until){
        DoUntil dountil = new DoUntil(until.getUntil(), what);
        return dountil;
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ErrorMessage error(){
        return new ErrorMessage("Please provide a number!");
    }
}
