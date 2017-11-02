package com.greenfocacademy.todoproject;

		import com.greenfocacademy.todoproject.model.Todo;
		import com.greenfocacademy.todoproject.repository.TodoRepo;
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.boot.CommandLineRunner;
		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoprojectApplication implements CommandLineRunner {

	@Autowired
	TodoRepo todoRepo;

	public static void main(String[] args) {
		SpringApplication.run(TodoprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		todoRepo.save(new Todo("I have to learn Object Relational Mapping"));
	}
}
