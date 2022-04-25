package com.example.restspringpeople.repository;

import com.example.restspringpeople.entity.ToDoEntity;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepo extends CrudRepository<ToDoEntity, Long> {
}
