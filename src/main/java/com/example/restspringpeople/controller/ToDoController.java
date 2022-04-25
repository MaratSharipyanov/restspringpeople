package com.example.restspringpeople.controller;

import com.example.restspringpeople.entity.ToDoEntity;
import com.example.restspringpeople.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @PostMapping
    public ResponseEntity createTodo(@RequestBody ToDoEntity toDo, @RequestParam Long userId) {
        try {
            return ResponseEntity.ok(toDoService.createToDo(toDo, userId));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Произошла ошибка");
        }
    }

    @PutMapping
    public ResponseEntity completeToDo(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(toDoService.complete(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Тагын бер ошибка");
        }
    }
}
