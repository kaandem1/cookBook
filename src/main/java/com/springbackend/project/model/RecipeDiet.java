package com.springbackend.project.model;
import jakarta.persistence.*;
@Entity
@Table(name = "recipe_diet")
public class RecipeDiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dietID;

    @Column(name = "dietName", nullable = false, length = 45)
    private String dietName;
}
