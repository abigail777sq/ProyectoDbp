package com.example.demo.Clases;
import java.util.Set;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
@JsonIdentityInfo(
  generator = ObjectIdGenerators.PropertyGenerator.class, 
  property = "id")
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    
   /*  @OneToMany(mappedBy="Orden")
    private Set <Product>  product;*/
/////////////////////////////////////////////////////////
   /* @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orden_id", referencedColumnName = "id")//preguntar a mateo 
    private User user;*/ 
/////////////////////////////////////////////////
    private int quantity;
    private double totalPrice;

    public long  getuserId() {
        return id;
    }

    public void setuserId(long userId_) {
        id = userId_;
    }

    

    /*public Set<Product> getProduct() {
        return   product ;
    }

    public void setProduct(Set<Product> product_) {
        this.product = product;
    }
*/

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

