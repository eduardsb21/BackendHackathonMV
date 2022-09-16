/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlataformaGame.Game.repository;

import PlataformaGame.Game.crudRepository.partJuegoCrudRepository;
import PlataformaGame.Game.entity.ParticiparJuego;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eduar
 */
@Repository
public class PartJuegoRepository {

    @Autowired
    private partJuegoCrudRepository partJuegoRepository;

    public List<ParticiparJuego> getParticipaciones() {
        return (List<ParticiparJuego>) partJuegoRepository.findAll();
    }

    public Optional<ParticiparJuego> getParticipacionId(int id) {
        return partJuegoRepository.findById(id);
    }

    public ParticiparJuego saveParticipacion(ParticiparJuego participarJuego) {
        return partJuegoRepository.save(participarJuego);
    }

}
