package com.app.rest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
//anotaciones de JPA
@Entity
@Table(name = "producto")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "precio")
    private BigDecimal price; //monedas y dineros es recomendable bigdecimal que float o double

    @ManyToOne
    @JoinColumn(name = "id_fabricante", nullable = false) //nombre de la clave foranea que se creara, el nullable false es para que siempre tenga que estar esa relacion
    @JsonIgnore
    private Maker maker; //maker es el atributo en mappedBy
}
