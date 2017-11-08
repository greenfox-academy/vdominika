package com.greenfoxacademy.log.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Log {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    long id;
    String endpoint;
    String data;
    LocalDateTime createdAt;
}
