/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlataformaGame.Game.repository;

import PlataformaGame.Game.crudRepository.PreguntasCrudRepository;
import PlataformaGame.Game.entity.Preguntas;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eduar
 */
@Repository
public class PreguntasRepository {

    @Autowired
    private PreguntasCrudRepository preguntasCrudRepository;

    public List<Preguntas> getPreguntas() {
        return (List<Preguntas>) preguntasCrudRepository.findAll();
    }

    public Optional<Preguntas> getPreguntaId(int id) {
        return preguntasCrudRepository.findById(id);
    }

    public Preguntas savePregunta(Preguntas preguntas) {
        return preguntasCrudRepository.save(preguntas);
    }

}
