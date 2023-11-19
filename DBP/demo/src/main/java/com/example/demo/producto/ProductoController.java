package com.example.demo.producto;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/producto")
@CrossOrigin(origins = "*")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

//-----------------------------------------------------------------
//----------------------------------------------------------------

    @Secured({"ADMIN"})
    @PostMapping
    public ResponseEntity<Producto> createProducto(@RequestBody Producto producto) {
        return new ResponseEntity<>(productoService.saveProducto(producto), HttpStatus.CREATED);
    }

    @Secured({"ADMIN", "USER"})
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Producto>> GradeId(@PathVariable Long id) {
        return new ResponseEntity<>(productoService.findProductoById(id), HttpStatus.OK);
    }

    @Secured({"ADMIN", "USER"})
    @GetMapping
    public ResponseEntity<List<Producto>> getAllProductos() {
        return new ResponseEntity<>(productoService.findAllProductos(), HttpStatus.OK);
    }  

    @Secured({"ADMIN"})
    @PatchMapping("/{id}")
    public ResponseEntity<String> patchProducto(@PathVariable Long id, @RequestBody Producto producto) {
        Optional<Producto> patchedProducto = productoService.patchProducto(id, producto);
        return patchedProducto.isPresent() ? ResponseEntity.status(200).body("Updated partially") : ResponseEntity.status(404).body("Not Found");
    }

    @Secured({"ADMIN"})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProducto(@PathVariable Long id) {
        productoService.deleteProducto(id);
        return new ResponseEntity<>(HttpStatus.OK);    
}
//PUT 
   @Secured({"ADMIN", "USER"})
    @PutMapping("/{id}")
    public ResponseEntity<Producto> updateReservas(@PathVariable Long id, @RequestBody Producto producto) {
        Producto updateProducto = productoService.ipdateProducto(id, producto);
        if (updateProducto != null) {
            return new ResponseEntity<>(updateProducto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
