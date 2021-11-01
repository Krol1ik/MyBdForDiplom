package com.example.mybdfordiplom.entity;

import javax.persistence.*;

@Entity
public class RoleUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column (name = "Role", nullable = false)
    private String role;
    @OneToOne(mappedBy = "roleUser", cascade = CascadeType.ALL, orphanRemoval = true)
    private User user;
}
