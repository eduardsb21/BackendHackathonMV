/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlataformaGame.Game.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name="crearJuego")
public class CrearJuego implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGame;
    private String titulo;
    private String categoria;
    private int nivel;
    private String objetivo;
   
    
    
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "crearJuego")
    @JsonIgnoreProperties("crearJuego")
    private List<Preguntas> preguntases;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties("crearJuegos")
    private User user;
    
    
    
}
