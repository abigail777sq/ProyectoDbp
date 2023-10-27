package com.example.demo.Infraestructure;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Clases.Usuarios;
public interface  UserRepository  extends JpaRepository<Usuarios, Long> {
    
}