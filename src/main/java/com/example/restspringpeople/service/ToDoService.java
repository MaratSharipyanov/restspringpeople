package com.example.restspringpeople.service;

import com.example.restspringpeople.entity.ToDoEntity;
import com.example.restspringpeople.entity.UserEntity;
import com.example.restspringpeople.model.ToDo;
import com.example.restspringpeople.repository.ToDoRepo;
import com.example.restspringpeople.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepo toDoRepo;

    @Autowired
    private UserRepo userRepo;

    public ToDo createToDo(ToDoEntity toDo, Long userId) {
        UserEntity user = userRepo.findById(userId).get();
        toDo.setUser(user);
        return ToDo.toDoModel(toDoRepo.save(toDo));
    }

    public ToDo complete(Long id) {
        ToDoEntity toDo = toDoRepo.findById(id).get();
        toDo.setCompleted(!toDo.getCompleted());
        return ToDo.toDoModel(toDoRepo.save(toDo));
    }
}
