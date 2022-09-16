/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlataformaGame.Game.controller;

import PlataformaGame.Game.entity.CrearJuego;
import PlataformaGame.Game.service.CrearJuegoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author eduar
 */
@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/crearJuego")
public class CrearJuegoController {

    @Autowired
    /**
     * instancia del servicio de crear un juego
     */
    private CrearJuegoService crearJuegoService;

    @GetMapping("/all")
    /**
     * Servicio traer todos los juegos
     */
    public List<CrearJuego> findAllGames() {
        return crearJuegoService.getGames();
    }

    @GetMapping("/{id}")
    /**
     * Servicio para traer un juego por id
     */
    public Optional<CrearJuego> findGameId(@PathVariable int id) {
        return crearJuegoService.getGameId(id);
    }

    @PostMapping("/save")
    public ResponseEntity saveGame(@RequestBody CrearJuego crearJuego) {
        crearJuegoService.saveGame(crearJuego);
        return ResponseEntity.status(201).build();

    }

}
