package com.springbackend.project.model;
import jakarta.persistence.*;
@Entity
@Table(name = "recipe_type")
public class RecipeType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int typeID;
    @Column(name = "typeName", nullable = false, length = 45)
    private String typeName;
}
