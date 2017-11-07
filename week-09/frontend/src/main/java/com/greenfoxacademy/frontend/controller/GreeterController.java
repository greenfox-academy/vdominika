package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.Doubling;
import com.greenfoxacademy.frontend.model.ErrorMessage;
import com.greenfoxacademy.frontend.model.Greeter;
import com.greenfoxacademy.frontend.model.GreetingError;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreeterController {

    @RequestMapping(value ="/greeter", method= RequestMethod.GET)
    public Greeter greeter (@RequestParam(value = "name") String name, @RequestParam(value = "title") String title){
        Greeter greeter = new Greeter (name, title);
        return greeter;
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public GreetingError error(MissingServletRequestParameterException ex){
        String exception_type = ex.getParameterName();

        return new GreetingError(exception_type);
    }
}
