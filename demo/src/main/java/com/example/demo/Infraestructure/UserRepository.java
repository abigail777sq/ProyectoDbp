package com.example.demo.Infraestructure;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Clases.User;
public interface  UserRepository  extends JpaRepository<User, Long> {
    
}