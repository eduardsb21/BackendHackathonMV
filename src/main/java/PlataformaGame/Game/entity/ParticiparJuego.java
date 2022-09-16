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
@Table(name="participarJuego")
public class ParticiparJuego implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPart;
    private int preguntasCorrectas;
    private float puntaje;
    private float tiempo;
    
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "participarJuego")
    @JsonIgnoreProperties("participarJuego")
    private List<User> users;
    
}
