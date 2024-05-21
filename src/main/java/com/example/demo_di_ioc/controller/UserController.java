package com.example.demo_di_ioc.controller;

import com.example.demo_di_ioc.entities.User;
import com.example.demo_di_ioc.respositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.access.method.P;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserController {
    private final UserRepository userRepository;
    @GetMapping
    public List<User> findAll() {
        return userRepository.findAll();
    }
    @PostMapping
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }
}
