package com.example.demo.orden;


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

import com.example.demo.producto.Producto;



@RestController
@RequestMapping("/orden")
@CrossOrigin(origins = "*")
public class OrdenController {

    @Autowired
    private OrdenService ordenService; 

    @Secured({"ADMIN", "USER"})
    @PostMapping
    public ResponseEntity<Orden> createProducto(@RequestBody Orden orden) {
        return new ResponseEntity<>(ordenService.SaveOrden(orden), HttpStatus.CREATED);
    }

    @Secured({"ADMIN", "USER"})
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Orden>> GradeId(@PathVariable Long id) {
        return new ResponseEntity<>(ordenService.findOrdenById(id), HttpStatus.OK);
    }

    @Secured({"ADMIN", "USER"})
    @GetMapping
    public ResponseEntity<List<Orden>> getAllProductos() {
        return new ResponseEntity<>(ordenService.findAllOrden(), HttpStatus.OK);
    }  

    @Secured({"ADMIN", "USER"})
    @PatchMapping("/{id}")
    public ResponseEntity<String> patchProducto(@PathVariable Long id, @RequestBody Orden orden) {
        Orden patchedOrden = ordenService.partialUpdateOrden(id, orden);
        if (patchedOrden!= null) {
            return ResponseEntity.status(200).body("Updated partially");
        } else {
            return ResponseEntity.status(404).body("Not Found");
        }
    }
    
//put 
 @Secured({"ADMIN", "USER"})
    @PutMapping("/{id}")
    public ResponseEntity<Orden> updateReservas(@PathVariable Long id, @RequestBody Orden orden) {
        Orden updateOrden = ordenService.updateOrden(id, orden);
        if (updateOrden != null) {
            return new ResponseEntity<>(updateOrden, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }



    @Secured({"ADMIN"})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProducto(@PathVariable Long id) {
        ordenService.deleteOrden(id);
        return new ResponseEntity<>(HttpStatus.OK);    
}

    
}


