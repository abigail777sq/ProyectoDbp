package com.example.demo.mesa;
import com.example.demo.reservas.Reservas;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Mesa {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)  
Long id;
Long capacidad;
@OneToOne(cascade = CascadeType.ALL)
Reservas reserva;
boolean libre;  

public Mesa(){}
  
public Mesa(Long capacidad, Reservas reserva, boolean libre) {
    this.capacidad = capacidad;
    this.reserva = reserva;
    this.libre = libre;
}

public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public Long getCapacidad() {
    return capacidad;
}
public void setCapacidad(Long capacidad) {
    this.capacidad = capacidad;
}

public Reservas getReserva() {
    return reserva;
}
    

public void setReserva(Reservas reserva) {
    this.reserva = reserva;
}

public boolean isLibre() {
    return libre;
}

public void setLibre(boolean libre) {
    this.libre = libre;
};


  
}
