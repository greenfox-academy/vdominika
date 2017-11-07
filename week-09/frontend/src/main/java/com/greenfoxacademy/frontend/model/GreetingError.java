package com.greenfoxacademy.frontend.model;

public class GreetingError {

    public String error;

    public GreetingError (String error) {

        this.error = "Please provide a " +error+"!";
    }
}
