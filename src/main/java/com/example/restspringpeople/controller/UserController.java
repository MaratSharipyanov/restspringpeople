package com.example.restspringpeople.controller;

import com.example.restspringpeople.entity.UserEntity;
import com.example.restspringpeople.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public ResponseEntity registration(@RequestBody UserEntity user) {
        try {
            if (userRepo.findByUsername(user.getUsername()) != null) {
                return ResponseEntity.badRequest().body("Пользователь с таким именем уже существует");
            }
            userRepo.save(user);
            return ResponseEntity.ok("Пользователь успешно добавлен");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @GetMapping
    public ResponseEntity getUsers() {
        try {
            return ResponseEntity.ok("Server works");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error2");
        }
    }
}
