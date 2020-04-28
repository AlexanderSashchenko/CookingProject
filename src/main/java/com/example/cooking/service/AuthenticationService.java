package com.example.cooking.service;

import com.example.cooking.exception.AuthenticationException;
import com.example.cooking.model.User;
import org.springframework.stereotype.Service;

@Service
public interface AuthenticationService {
    User login(String email, String password) throws AuthenticationException;

    User register(String email, String password);
}
