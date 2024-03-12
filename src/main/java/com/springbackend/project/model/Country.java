package com.springbackend.project.model;
import jakarta.persistence.*;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int countryID;

    @Column(name = "countryName", nullable = false, length = 45)
    private String countryName;
}
