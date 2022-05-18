package com.example.pizzaaplicationtest.data.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity

@Table(name = "sizes")
public class SizeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "size_type")
    private String sizeType;

    @Column(name = "price_base")
    private BigDecimal priceBase;

    @Column(name = "pizza_id")
    private Integer pizzaId;

    @OneToMany(mappedBy = "size")
    private Set<SizeEntity> orderSizes;

    @ManyToOne
    @JoinColumn(name = "pizza_id", insertable = false, updatable = false)
    private PizzaEntity pizza;


    public SizeEntity() {
    }

    public SizeEntity(Integer id, String sizeType, BigDecimal priceBase, Integer pizzaId, Set<SizeEntity> orderSizes, PizzaEntity pizza) {
        this.id = id;
        this.sizeType = sizeType;
        this.priceBase = priceBase;
        this.pizzaId = pizzaId;
        this.orderSizes = orderSizes;
        this.pizza = pizza;
    }
}

