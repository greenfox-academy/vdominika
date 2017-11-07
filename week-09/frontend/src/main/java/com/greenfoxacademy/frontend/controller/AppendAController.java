package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.AppendA;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppendAController {

    @RequestMapping(value ="/appenda/{appendable}", method= RequestMethod.GET)
    public AppendA append (@PathVariable String appendable){
        AppendA appenda = new AppendA (appendable);
        return appenda;
    }
}
