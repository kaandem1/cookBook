package com.springbackend.project.model;

import jakarta.persistence.*;

@Entity
@Table(name = "groupMembers")
public class GroupMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Surrogate key for the association

    @ManyToOne
    @JoinColumn(name = "groupID", nullable = false)
    private Group group;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private User user;

    @Column(nullable = false)
    private String role;

}
