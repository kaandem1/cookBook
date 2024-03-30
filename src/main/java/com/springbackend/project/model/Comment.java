package com.springbackend.project.model;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentID;

    @ManyToOne
    @JoinColumn(name = "recipeID", nullable = false)
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private User user;

    @Column(nullable = true)
    private String commentText;

    @Column(nullable = true)
    private Date commentDate;

    @Column(nullable = true)
    private Date deletedAt;

}