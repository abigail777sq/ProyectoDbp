package com.example.demo.Infraestructure;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Clases.Product;

public interface  ProductRepository  extends JpaRepository<Product, Long> {
    
}

