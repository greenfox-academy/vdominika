package com.greenfocacademy.todoproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;
    String title;
    boolean isUrgent;
    boolean isDone;

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public boolean isUrgent() {

        return isUrgent;
    }

    public void setUrgent(boolean urgent) {

        isUrgent = urgent;
    }

    public boolean isDone() {

        return isDone;
    }

    public void setDone(boolean done) {

        isDone = done;
    }

    public Todo() {

    }

    public Todo(String s) {
        this.title = s;
    }
}
