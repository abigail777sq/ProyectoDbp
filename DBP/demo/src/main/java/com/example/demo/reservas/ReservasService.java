package com.example.demo.reservas;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ReservasService {

    @Autowired
    ReservasRepository reservasRepository;

    //get
    public List<Reservas> getReserva(){
        return reservasRepository.findAll();
    }
    //get id
    public Optional<Reservas> getReservaById(Long id){
        return reservasRepository.findById(id);
    }  

    //post
       public Reservas SaveReservas( Reservas reservas){
        return reservasRepository.save(reservas);
    }
    //put 
 public Reservas updateReservas(Long id, Reservas Reservas) {
    Optional<Reservas> existinReservas = reservasRepository.findById(id);
    if (existinReservas.isPresent()) {
        Reservas.setId(id);
        return reservasRepository.save(Reservas);
    }
    return null;
}

    //patch
    
    public Optional<Reservas> actualizarReservaParcial(Long id, Reservas reservaActualizada) {
        Optional<Reservas> reservaExistente = reservasRepository.findById(id);

        if(reservaExistente.isPresent()){
            Reservas reservaSi=reservaExistente.get();
        if (reservaActualizada.getFecha() != null) {
            reservaSi.setFecha(reservaActualizada.getFecha());
        }

        if (reservaActualizada.getMesa() != null) {
            reservaSi.setMesa(reservaActualizada.getMesa());
        }

        if (reservaActualizada.getUser() != null) {
            reservaSi.setUser(reservaActualizada.getUser());
            
        }
        reservasRepository.save(reservaSi);
    }
        return reservaExistente;
    
}
  
    
    //delete
  public void deleteReserva(Long id) {
        reservasRepository.deleteById(id);}}
