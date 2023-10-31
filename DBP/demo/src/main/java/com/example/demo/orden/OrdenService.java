package com.example.demo.orden;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrdenService {
    @Autowired
    OrdenRepository OrdenRepository;

    public Orden SaveOrden( Orden orden_){
        return OrdenRepository.save(orden_);
    }

    public Optional<Orden>findOrdenById(long id){
        return OrdenRepository.findById(id);
    }

    public  List<Orden> findAllOrden(){
        return OrdenRepository.findAll();
    }
    public  Orden updateOrden(long id , Orden orden_){
        Optional<Orden>orden_n=OrdenRepository.findById(id);
        if (orden_n.isPresent()){
            orden_.setuserId(id);
            return OrdenRepository.save(orden_);
        }
        return null;
    }
    public  Orden partialUpdateOrden(Long id,  Orden  Orden_) {
        Optional< Orden> existing =  OrdenRepository.findById(id);
        if (existing.isPresent()) {
            BeanUtils.copyProperties( Orden_, existing.get(), "id");
            return  OrdenRepository.save(existing.get());//porque get 
        }
        return null;
    }

    public void deleteOrden(Long id) {
        OrdenRepository.deleteById(id);}
}
