package com.greenfoxacademy.helloworldapp;

public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = "Hello world";
    }

    public String getMessage(){
        System.out.println("Your message: " + "Hello World!");
        return message;
    }
}
