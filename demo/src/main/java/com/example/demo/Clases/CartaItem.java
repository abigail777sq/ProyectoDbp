package com.example.demo.Clases;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CartaItem {
      @Id
    @GeneratedValue
    private int CartItemId;
    private String name ;
    private String Description ;
    private List<Product> lista_productos;
    
    // Constructor, getters y setters
    // Constructor vacío
    public CartaItem() {
    }

    // Constructor con parámetros
    public CartaItem(String name, String description, List<Product> lista_productos) {
        this.name = name;
        Description = description;
        this.lista_productos = lista_productos;
    }

    // Getters y Setters
    public int getCartaItemId() {
        return CartItemId;
    }

    public void setCartaItemId(int cartaItemId) {
        CartItemId = cartaItemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public List<Product> getLista_productos() {
        return lista_productos;
    }

    public void setLista_productos(List<Product> lista_productos) {
        this.lista_productos = lista_productos;
    }

    


}




