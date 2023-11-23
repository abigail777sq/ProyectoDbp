package com.example.demo.reservas;
import com.example.demo.mesa.Mesa;
import com.example.demo.usuario.domain.User;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Reservas{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
Long id;
String fecha;
@JsonIgnore
@OneToOne(cascade = CascadeType.ALL)
Mesa mesa;
@JsonIgnore
@OneToOne(cascade = CascadeType.ALL)
User user;
public Reservas(){
}

public Reservas(String fecha, Mesa mesa, User user) {
    this.fecha = fecha;
    this.mesa = mesa;
    this.user = user;
}

public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getFecha() {
    return fecha;
}
public void setFecha(String fecha) {
    this.fecha = fecha;
}
public Mesa getMesa() {
    return mesa;
}
public void setMesa(Mesa mesa) {
    this.mesa = mesa;
}

public User getUser() {
    return this.user;
}

public void setUser(User user) {
    this.user = user;
}
 
public void MesaEnReserva(Mesa mesa){
mesa.setLibre(false);   
this.mesa=mesa;
mesa.setReserva(this);

}}