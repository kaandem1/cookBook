package com.springbackend.project.model;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "userActivityLog")
public class UserActivityLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long logID;

    @ManyToOne
    @JoinColumn(name = "userID", nullable = false)
    private User user;

    @Column(nullable = false)
    private String activityType;

    @Column(nullable = false)
    private Date activityDate;

    @Column(nullable = true)
    private String description;
}