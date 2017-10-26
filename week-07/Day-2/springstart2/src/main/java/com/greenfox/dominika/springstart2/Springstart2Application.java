package com.greenfox.dominika.springstart2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootApplication
@Controller
public class Springstart2Application {

	public static void main(String[] args) { SpringApplication.run(Springstart2Application.class, args);
	}
}
