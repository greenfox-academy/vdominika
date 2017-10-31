package com.greenfocacademy.todoproject.repository;

import com.greenfocacademy.todoproject.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<Todo, Long> {

}
