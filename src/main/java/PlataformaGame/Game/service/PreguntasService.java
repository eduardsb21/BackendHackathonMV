/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlataformaGame.Game.service;

import PlataformaGame.Game.entity.Preguntas;
import PlataformaGame.Game.repository.PreguntasRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author eduar
 */
@Service
public class PreguntasService {

    @Autowired
    private PreguntasRepository pregutasRepository;

    public List<Preguntas> getPreguntas() {
        return pregutasRepository.getPreguntas();
    }

    public Optional<Preguntas> getPreguntaId(int id) {
        return pregutasRepository.getPreguntaId(id);
    }

    public Preguntas savePregunta(Preguntas preguntas) {
        return pregutasRepository.savePregunta(preguntas);
    }

}
