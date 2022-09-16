/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlataformaGame.Game.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author eduar
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="respuestas")
public class Respuestas implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRespuesta;
    private String esCorrecta;
    private String opcionA;
    private String opcionB;
    private String opcionC;
    private String opcionD;
    
    @ManyToOne
    @JoinColumn(name = "respuestas_id")
    @JsonIgnoreProperties("respuestases")
    private Preguntas preguntas;
    
}
