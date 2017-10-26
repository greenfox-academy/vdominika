package com.greenfoxacademy.helloworldapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld message() {
        return new HelloWorld();
    }
}

