package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Clases.Orden;
public interface  OrdenRepository  extends JpaRepository<Orden, Long> {
    
}
