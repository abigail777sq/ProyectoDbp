package com.example.demo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Clases.User;
import com.example.demo.Infraestructure.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    
}
