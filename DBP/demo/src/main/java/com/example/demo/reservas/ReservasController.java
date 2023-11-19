package com.example.demo.reservas;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/reservas")
@CrossOrigin(origins = "*")
public class ReservasController {
        @Autowired
    private ReservasService reservasService; 

    @Secured({"ADMIN", "USER"})
    @PostMapping
    public ResponseEntity<Reservas> createreservas(@RequestBody Reservas reservas) {
        return new ResponseEntity<>(reservasService.SaveReservas(reservas), HttpStatus.CREATED);
    }

    @Secured({"ADMIN", "USER"})
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Reservas>> reservasId(@PathVariable Long id) {
        return new ResponseEntity<>(reservasService.getReservaById(id), HttpStatus.OK);
    }

    @Secured({"ADMIN"})
    @GetMapping
    public ResponseEntity<List<Reservas>> getAllreservas() {
        return new ResponseEntity<>(reservasService.getReserva(), HttpStatus.OK);
    }  
   @Secured({"ADMIN", "USER"})
    @PutMapping("/{id}")
    public ResponseEntity<Reservas> updateReservas(@PathVariable Long id, @RequestBody Reservas reservas) {
        Reservas updatedReservas = reservasService.updateReservas(id, reservas);
        if (updatedReservas != null) {
            return new ResponseEntity<>(updatedReservas, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @Secured({"ADMIN"})
    @PatchMapping("/{id}")
    public ResponseEntity<String> patchReservas(@PathVariable Long id, @RequestBody Reservas reservas) {
        Optional<Reservas> patchedReserva = reservasService.actualizarReservaParcial(id, reservas);
        return patchedReserva.isPresent() ? ResponseEntity.status(200).body("Updated partially") : ResponseEntity.status(404).body("Not Found");
    }


    @Secured({"ADMIN", "USER"})
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletereservas(@PathVariable Long id) {
        reservasService.deleteReserva(id);
        return new ResponseEntity<>(HttpStatus.OK); 
}
}
