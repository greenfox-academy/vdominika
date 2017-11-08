package com.greenfoxacademy.frontend.model;

import java.util.ArrayList;

public class ArrayHandler {

    String what;
    ArrayList<Integer> number;

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public ArrayList<Integer> getNumber() {
        return number;
    }

    public void setNumber(ArrayList<Integer> number) {
        this.number = number;
    }

    public ArrayHandler() {
    }

    public ArrayHandler(String what, ArrayList<Integer> number) {

        this.what = what;
        this.number = number;
    }

}
