package com.example.demo.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Clases.Product;
import com.example.demo.Infraestructure.ProductRepository;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    //guardar 
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
    //mostrar todos
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }


    public Product updateProduct(Long id,Product product) {
        Optional<Product> products=productRepository.findById(id);
        if(products.isPresent()) {
            Product existingProduct=products.get();
            existingProduct.setProductId(id);
            return productRepository.save(existingProduct);
    }
    return null;
}



}
