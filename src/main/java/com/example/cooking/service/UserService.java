package com.example.cooking.service;

import com.example.cooking.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {
    User add(User user);
    Optional<User> get(Long id);
    User update(User user);
    void delete(User user);
}
