package com.example.demo.orden;

import java.util.List;

import com.example.demo.usuario.domain.User;
import com.example.demo.producto.Producto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
@Entity
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long Id;
    
    @OneToMany
    private List<Producto> Producto;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    private int quantity;
    private double totalPrice;
public Orden(){

}

    public Orden(List<com.example.demo.producto.Producto> producto, User user, int quantity, double totalPrice) {
    Producto = producto;
    this.user = user;
    this.quantity = quantity;
    this.totalPrice = totalPrice;
}

    public long  getuserId() {
        return Id;
    }

    public void setuserId(long userId_) {
        Id = userId_;
    }

    

    public List<Producto> getProducto() {
        return Producto;
    }

    public void setProducto(List<Producto> Producto) {
        this.Producto = Producto;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
}

