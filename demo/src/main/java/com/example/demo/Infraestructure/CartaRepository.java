package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Clases.Carta;
public interface  CartaRepository  extends JpaRepository<Carta, Long> {
    
}



