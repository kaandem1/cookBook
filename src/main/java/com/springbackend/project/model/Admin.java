package com.springbackend.project.model;
import jakarta.persistence.*;
@Entity
@Table(name = "admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminID;

    @ManyToOne
    @JoinColumn(name = "actorID", nullable = false)
    private Actor actor;

}
