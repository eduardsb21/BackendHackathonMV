/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlataformaGame.Game.service;

import PlataformaGame.Game.entity.ParticiparJuego;
import PlataformaGame.Game.repository.PartJuegoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author eduar
 */
@Service
public class PartJuegoService {
    @Autowired
    private PartJuegoRepository partJuegoRepository;
    
    public List<ParticiparJuego> getParticipaciones(){
        return partJuegoRepository.getParticipaciones();
    }
    
    public Optional<ParticiparJuego> getParticipacionId(int id){
        return partJuegoRepository.getParticipacionId(id);
    }
    
    public ParticiparJuego saveParticipacion(ParticiparJuego participarJuego){
        return partJuegoRepository.saveParticipacion(participarJuego);
    }
}
