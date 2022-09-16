/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlataformaGame.Game.repository;

import PlataformaGame.Game.crudRepository.respuestasCrudRepository;
import PlataformaGame.Game.entity.Respuestas;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eduar
 */
@Repository
public class RespuestasRepository {
    @Autowired
    private respuestasCrudRepository respuestasCrudRepository;
    
    public List<Respuestas> getRespuestas(){
        return (List<Respuestas>) respuestasCrudRepository.findAll();
    }
    public Optional<Respuestas> getRespuestaId(int id){
        return respuestasCrudRepository.findById(id);
    }
    
    public Respuestas saveRespuesta(Respuestas respuestas){
        return respuestasCrudRepository.save(respuestas);
    }
    
}
