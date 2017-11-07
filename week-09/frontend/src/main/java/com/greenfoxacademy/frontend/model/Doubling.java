package com.greenfoxacademy.frontend.model;

public class Doubling {
    public int received;
    public int result;

    public Doubling (int received){
        this.received = received;
        this.result = received * 2;
    }
}