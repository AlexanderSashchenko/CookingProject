package com.example.cooking.service.impl;

import com.example.cooking.exception.AuthenticationException;
import com.example.cooking.model.Role;
import com.example.cooking.model.User;
import com.example.cooking.repository.RoleRepository;
import com.example.cooking.repository.UserRepository;
import com.example.cooking.service.AuthenticationService;
import com.example.cooking.service.UserService;
import java.util.HashSet;
import java.util.Set;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserService userService;
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public AuthenticationServiceImpl(UserService userService,
                                     PasswordEncoder passwordEncoder,
                                     UserRepository userRepository,
                                     RoleRepository roleRepository) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public User login(String email, String password) throws AuthenticationException {
        User user = userService.getByEmail(email);
        if (user.getPassword().equals(passwordEncoder.encode(password))) {
            return user;
        }
        throw new AuthenticationException("Incorrect login or password!");
    }

    @Override
    public User register(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(passwordEncoder.encode(password));
        Set<Role> roles = new HashSet<>();
        roles.add(roleRepository.findByRoleName("USER"));
        user.setRoles(roles);
        userRepository.save(user);
        return user;
    }
}
