package com.example.demo.MesaEnReserva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservar")

public class MesaEnReservaController {
    @Autowired
    MesaEnReservaService mesaEnReservaService;
     @Secured({"ADMIN", "USER"})
    @PostMapping
    public ResponseEntity<String> ReservarMesasEnReserva( @RequestParam Long MesaId, @RequestParam Long reservaId, @RequestParam String fecha){
        try {
            mesaEnReservaService.MesaEnReserva(MesaId, reservaId,fecha) ;  
            return ResponseEntity.ok("Mesa reservada correctamente");
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    
    }
}
