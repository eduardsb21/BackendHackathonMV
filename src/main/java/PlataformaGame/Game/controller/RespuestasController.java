/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlataformaGame.Game.controller;


import PlataformaGame.Game.entity.Respuestas;
import PlataformaGame.Game.service.RespuestasService;
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
@RequestMapping("/api/respuestas")
public class RespuestasController {
    @Autowired
    private RespuestasService respuestasService;
    
    @GetMapping("/all")
    public List<Respuestas> findAllRespuestas(){
        return respuestasService.getRespuestas();
    }
    @GetMapping("/{id}")
    public Optional<Respuestas> finRespuestaId(@PathVariable int id) {
        return respuestasService.getRespuestaId(id);
    }

    @PostMapping("save")
    public ResponseEntity saveRespuesta(@RequestBody Respuestas respuestas) {
        respuestasService.saveRespuesta(respuestas);
        return ResponseEntity.status(201).build();
    }
    
}
