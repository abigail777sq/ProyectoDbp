package com.example.demo.mesa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MesaService {
    @Autowired
    MesaRepository mesaRepository;
    //get
    public List<Mesa> getMesas(){
        return mesaRepository.findAll();
    }
    //get id
    public Optional<Mesa> getMesabyId(Long id){
        return mesaRepository.findById(id);
    }

    //post
       public Mesa SaveMesa( Mesa mesa){
        return mesaRepository.save(mesa);
    }
    //put
   public Mesa updateMesa(Long id, Mesa Mesa) {
    Optional<Mesa> existinMesa = mesaRepository.findById(id);
    if (existinMesa.isPresent()) {
        Mesa.setId(id);
        return mesaRepository.save(Mesa);
    }
    return null;
}

    //patch
    public Mesa partialUpdateMesa(Long id, Mesa mesa) {
        Optional<Mesa> existing = mesaRepository.findById(id);
        if (existing.isPresent()) {
            BeanUtils.copyProperties(mesa, existing.get(), "id");
            return mesaRepository.save(existing.get());
        }
        return null;
    }
    
    //delete
  public void deleteMesa(Long id) {
        mesaRepository.deleteById(id);}
}
