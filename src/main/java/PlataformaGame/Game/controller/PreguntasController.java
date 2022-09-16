/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlataformaGame.Game.controller;

import PlataformaGame.Game.entity.Preguntas;
import PlataformaGame.Game.service.PreguntasService;
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
@RequestMapping("/api/preguntas")
public class PreguntasController {

    @Autowired
    private PreguntasService preguntasService;

    @GetMapping("/all")
    public List<Preguntas> findAllPreguntas() {
        return preguntasService.getPreguntas();

    }

    @GetMapping("/{id}")
    public Optional<Preguntas> finPreguntaId(@PathVariable int id) {
        return preguntasService.getPreguntaId(id);
    }

    @PostMapping("save")
    public ResponseEntity savePregunta(@RequestBody Preguntas preguntas) {
        preguntasService.savePregunta(preguntas);
        return ResponseEntity.status(201).build();
    }
}
