/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlataformaGame.Game.service;

import PlataformaGame.Game.entity.CrearJuego;
import PlataformaGame.Game.repository.CrearJuegoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author eduar
 */
@Service
public class CrearJuegoService {

    @Autowired
    private CrearJuegoRepository crearJuegoRepository;

    public List<CrearJuego> getGames() {
        return crearJuegoRepository.getJuegos();
    }

    public Optional<CrearJuego> getGameId(int id) {
        return crearJuegoRepository.getJuegoId(id);
    }

    public CrearJuego saveGame(CrearJuego crearJuego) {
        return crearJuegoRepository.saveJuego(crearJuego);
    }

}
