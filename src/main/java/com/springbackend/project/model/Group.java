package com.springbackend.project.model;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "groupstable")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long groupID;

    @Column(nullable = false)
    private String groupName;

    @Column(nullable = true)
    private String description;

    @Column(nullable = true)
    private Date creationDate;

    @Column(nullable = true)
    private Date deletedAt;

    @ManyToOne
    @JoinColumn(name = "adminUserID", nullable = false)
    private User admin;

    @OneToMany(mappedBy = "group")
    private List<GroupMember> members;

}