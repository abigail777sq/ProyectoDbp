package com.example.demo.MesaEnReserva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mesa.Mesa;
import com.example.demo.mesa.MesaRepository;
import com.example.demo.reservas.Reservas;
import com.example.demo.reservas.ReservasRepository;

@Service
public class MesaEnReservaService {
    @Autowired
    private MesaRepository mesaService;
    @Autowired
    private ReservasRepository reservaService;

    public void MesaEnReserva(Long mesaId, Long resevaId){
        Mesa mesa= mesaService.findById(mesaId).orElseThrow(() -> new RuntimeException("Mesa no encontrada"));
        Reservas reservas= reservaService.findById(resevaId).orElseThrow(() -> new RuntimeException("Reserva no encontrada"));
        reservas.MesaEnReserva(mesa);
        reservaService.save(reservas);
    }
}
