package com.greenfoxacademy.log.controller;

import com.greenfoxacademy.log.model.Log;
import com.greenfoxacademy.log.repository.LogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    @Autowired
    LogRepo logrepo;

    @RequestMapping({"/"})
    public String List (){
        logrepo.save(new Log());
        return "OK";
    }
}
