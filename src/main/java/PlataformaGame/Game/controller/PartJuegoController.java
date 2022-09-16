/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlataformaGame.Game.controller;

import PlataformaGame.Game.entity.ParticiparJuego;
import PlataformaGame.Game.service.PartJuegoService;
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
@RequestMapping("/api/participacionJuego")
public class PartJuegoController {
    @Autowired
    private PartJuegoService partJuegoService;
    
    @GetMapping("/all")
    public List<ParticiparJuego>  findAllParticipaciones(){
        return partJuegoService.getParticipaciones();
    }
    @GetMapping("/{id}")
    public Optional<ParticiparJuego> findParticipacionId(@PathVariable int id){
        return partJuegoService.getParticipacionId(id);
        
    }
    @PostMapping("/save")
    public ResponseEntity saveParticipacion(@RequestBody ParticiparJuego participarJuego){
        partJuegoService.saveParticipacion(participarJuego);
        return ResponseEntity.status(201).build();
    }
}
