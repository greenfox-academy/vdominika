package com.greenfoxacademy.coloring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.*;

public class ColoringConfig {

    @Configuration
    public class HelloWorldConfig {
        @Bean
        public MyColor myColor() {
            return new MyColor() {
                @Override
                public void printColor() {
                    System.out.println("This color is red");
                }
            };
        }
    }
}
