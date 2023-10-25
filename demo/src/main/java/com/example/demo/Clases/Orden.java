package com.example.demo.Clases;
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
    private int userId;
    
    @OneToMany
    @JoinColumn(name = "productId")
    private Product product;

    private int quantity;
    private double totalPrice;

    public int getuserId() {
        return userId;
    }

    public void setuserId(int userId_) {
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

