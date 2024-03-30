package com.springbackend.project.model;
import jakarta.persistence.*;
@Entity
@Table(name = "ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ingredientID;

    @ManyToOne
    @JoinColumn(name = "recipeID", nullable = false)
    private Recipe recipe;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private Double quantity;

    @Column(nullable = true)
    private String unit;

}