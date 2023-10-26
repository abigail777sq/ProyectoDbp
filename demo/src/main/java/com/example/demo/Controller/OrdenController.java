package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Clases.Orden;
import com.example.demo.Service.OrdenService;

@RestController
@RequestMapping("/Orden")
public class OrdenController {
    @Autowired
    private OrdenService OrdenService_;
    @PostMapping()
    public ResponseEntity<Orden>createStudent(@RequestBody Orden Orden_){
        return new ResponseEntity<>(OrdenService_.SaveOrden(Orden_),HttpStatus.CREATED);
    }
     @GetMapping()
    public ResponseEntity <List<Orden>>getAllStudent(){
        return new ResponseEntity<>(OrdenService_.findAllOrden(),HttpStatus.CREATED);
    }
}
