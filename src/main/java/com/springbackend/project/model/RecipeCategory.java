package com.springbackend.project.model;
import jakarta.persistence.*;
@Entity
@Table(name = "recipeCategories")
public class RecipeCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryID;

    @Column(nullable = false, unique = true)
    private String categoryName;

}