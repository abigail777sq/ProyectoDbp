package com.example.demo.Clases;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @OneToOne
    private long userId;
    
    @OneToMany
    @JoinColumn(name = "productId")
    private Product product;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orden_id", referencedColumnName = "id")//preguntar a mateo 
    private User user;

    private int quantity;
    private double totalPrice;

    public long  getuserId() {
        return userId;
    }

    public void setuserId(long userId_) {
        userId = userId_;
    }

    

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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

