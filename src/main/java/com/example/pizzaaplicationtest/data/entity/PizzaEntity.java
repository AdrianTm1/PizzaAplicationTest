package com.example.pizzaaplicationtest.data.entity;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "pizzas")
public class PizzaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "pizza", orphanRemoval = true)
    private Set<SizeEntity> sizes;

    public PizzaEntity() {
    }

    public PizzaEntity(Integer id, String name, Set<SizeEntity> sizes) {
        this.id = id;
        this.name = name;
        this.sizes = sizes;
    }
}
