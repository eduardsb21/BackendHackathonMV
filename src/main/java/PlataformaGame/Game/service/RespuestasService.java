/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlataformaGame.Game.service;

import PlataformaGame.Game.entity.Respuestas;
import PlataformaGame.Game.repository.RespuestasRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author eduar
 */
@Service
public class RespuestasService {

    @Autowired
    private RespuestasRepository respuestasRepository;

    public List<Respuestas> getRespuestas() {
        return respuestasRepository.getRespuestas();
    }

    public Optional<Respuestas> getRespuestaId(int id) {
        return respuestasRepository.getRespuestaId(id);
    }

    public Respuestas saveRespuesta(Respuestas respuestas) {
        return respuestasRepository.saveRespuesta(respuestas);
    }
}
