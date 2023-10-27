package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Clases.Usuarios;
import com.example.demo.Infraestructure.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    
    public void saveUser(Usuarios Usuario) {
    Usuarios usser=new Usuarios();

    }

}
