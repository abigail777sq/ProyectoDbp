package com.example.demo.producto;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.usuario.domain.User;
import com.example.demo.usuario.repository.UserRepository;


@Service
public class ProductoService{
   
    @Autowired
    private ProductoRepository  productoRepository;
  

    //guardar producto
    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    //buscar producto por Id
    public Optional<Producto> findProductoById(Long id) {
        return productoRepository.findById(id);
    }

    //encontrar todos los productos
    public List<Producto> findAllProductos() {
        return productoRepository.findAll();
    }


    //patchear producto
    public Optional<Producto> patchSong(Long id, Producto producto) {
        Optional<Producto> optionalProducto = productoRepository.findById(id);
        if (optionalProducto.isPresent()) {
            Producto existingProducto = optionalProducto.get();
            if (producto.getProductName() != null) {
                existingProducto.setProductName(producto.getProductName());
            }
            if (producto.getProductCategory() != null) {
                existingProducto.setProductCategory(producto.getProductCategory());
            }
            if (producto.getProductDescription() != null) {
                existingProducto.setProductDescription(producto.getProductDescription());
            }
            if (producto.getProductPrice() != 0) {
                existingProducto.setProductPrice(producto.getProductPrice());
            }
            if (producto.getProductCondition()!= null) {
                existingProducto.setProductCondition(producto.getProductCondition());
            }
            if (producto.getProductStatus()!= null) {
                existingProducto.setProductStatus(producto.getProductStatus());
            }
            if (producto.getUnitInStock()!= 0) {
                existingProducto.setUnitInStock(producto.getUnitInStock());
            }
           
            productoRepository.save(existingProducto);
            }
            return optionalProducto;

        }
//put

public Producto ipdateProducto(Long id, Producto producto) {
    Optional<Producto> existinProducto = productoRepository.findById(id);
    if (existinProducto.isPresent()) {
        producto.setId(id);
        return productoRepository.save(producto);
    }
    return null;
}

//delete
        public void deleteProducto(Long id) {
             productoRepository.deleteById(id);
        }

      
        
       
}