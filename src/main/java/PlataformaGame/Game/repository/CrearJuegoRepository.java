/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlataformaGame.Game.repository;

import PlataformaGame.Game.crudRepository.CrearJuegoCrudRepository;
import PlataformaGame.Game.entity.CrearJuego;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eduar
 */
@Repository
public class CrearJuegoRepository {

    @Autowired
    private CrearJuegoCrudRepository crearJuegoCrudRepository;

    public List<CrearJuego> getJuegos() {
        return (List<CrearJuego>) crearJuegoCrudRepository.findAll();
    }
    public Optional<CrearJuego> getJuegoId(int id){
        return crearJuegoCrudRepository.findById(id); 
    }
    
    public CrearJuego saveJuego(CrearJuego crearJuego){
        return crearJuegoCrudRepository.save(crearJuego);
        
    }
}
