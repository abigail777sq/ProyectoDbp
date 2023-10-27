package com.example.demo.Clases;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.*;

@Entity
@JsonIdentityInfo(
  generator = ObjectIdGenerators.PropertyGenerator.class, 
  property = "id")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;
    
    private String Usuariosname;
    private String password;
    private Boolean enabled;
/////////////////////////////////////////////////7
   /* @OneToOne(mappedBy = "Usuarios")
    private Orden ordenes; */ 
//////////////////////////////////////////////7

    public long getUsuariossId() {
        return id;
    }

    public void setUsuariossId(long UsuariossId) {
        this.id = UsuariossId;
    }

    public String getUsuariosname() {
        return Usuariosname;
    }

    public void setUsuariosname(String Usuariosname) {
        this.Usuariosname = Usuariosname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}