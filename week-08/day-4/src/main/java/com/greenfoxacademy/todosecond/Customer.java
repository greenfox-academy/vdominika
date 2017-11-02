package com.greenfoxacademy.todosecond;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue()
    String id;
    String anyother;
}
