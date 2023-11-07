package com.example.demo.usuario.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.usuario.domain.User;
import com.example.demo.usuario.service.UserService;


@RestController
@RequestMapping("/hello")
@CrossOrigin(origins = "*")
public class AuthorizationController {

    @Autowired
    private UserService userService;

    @Secured("ADMIN")
    @GetMapping("/admin")
    public ResponseEntity<String> hello() {
            return ResponseEntity.ok("Hello World from Admin!");
    }

    @Secured({"ADMIN", "USER"})
    @GetMapping("/user")
    public ResponseEntity<String> helloUser() {
        return ResponseEntity.ok("Hello World from User, of course Admin too :)!");
    }
    
    @Secured("ADMIN")
    @GetMapping("/users")
    public ResponseEntity<List<User>> getEnabledUsers() {
        return new ResponseEntity<>(userService.getEnabledUsers(), HttpStatus.OK);
    }
    
}
