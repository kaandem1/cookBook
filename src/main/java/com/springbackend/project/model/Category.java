package com.springbackend.project.model;
import jakarta.persistence.*;
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryID;
    @Column(name = "categoryName", nullable = false, length = 45)
    private String categoryName;
}
