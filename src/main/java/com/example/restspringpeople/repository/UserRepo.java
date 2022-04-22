package com.example.restspringpeople.repository;

import com.example.restspringpeople.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Long> {
    UserEntity findByUsername (String username);
}
