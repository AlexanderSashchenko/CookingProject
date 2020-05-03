package com.example.cooking.service.impl;

import com.example.cooking.model.User;
import com.example.cooking.repository.UserRepository;
import com.example.cooking.service.UserService;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User add(User user) {
        return userRepository.save(user);
    }

    @Override
    public User get(Long id) {
        return userRepository.findById(id).orElseThrow(() ->
                new RuntimeException("User was not found!"));
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getByEmail(String email) {
        return userRepository.findByEmail(email).orElseThrow(() ->
                new RuntimeException("User was not found!"));
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }
}
