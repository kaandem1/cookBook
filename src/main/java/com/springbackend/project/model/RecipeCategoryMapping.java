package com.springbackend.project.model;

import jakarta.persistence.*;

@Entity
@Table(name = "recipeCategoryMapping")
public class RecipeCategoryMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Using a surrogate key for the mapping table

    @ManyToOne
    @JoinColumn(name = "recipeID", nullable = false)
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name = "categoryID", nullable = false)
    private RecipeCategory category;

}