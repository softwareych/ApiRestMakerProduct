package com.app.rest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
//anotaciones de JPA
@Entity
@Table(name = "fabricante")
public class Maker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String name;

    /* se mapea con el atributo maker
cascade all: cualquier movimiento en cascada que se haga aqui lo haga tambien en product
lazy: no sobrecarge el list cuando cree un creador, solo la carga cuando la necesite
orphanRemoval: al eliminar un maker eliminan los products     */
    @OneToMany(mappedBy = "maker", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JsonIgnore
    private List<Product> productList = new ArrayList<>();
}
