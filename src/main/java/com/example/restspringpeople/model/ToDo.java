package com.example.restspringpeople.model;

import com.example.restspringpeople.entity.ToDoEntity;

public class ToDo {
    private Long id;
    private String title;
    private Boolean completed;

    public static ToDo toDoModel(ToDoEntity toDoEntity) {
        ToDo toDoModel = new ToDo();
        toDoModel.setId(toDoEntity.getId());
        toDoModel.setTitle(toDoEntity.getTitle());
        toDoModel.setCompleted(toDoEntity.getCompleted());
        return toDoModel;
    }

    public ToDo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
