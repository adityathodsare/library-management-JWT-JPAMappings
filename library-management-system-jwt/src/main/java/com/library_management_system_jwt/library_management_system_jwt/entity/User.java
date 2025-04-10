package com.library_management_system_jwt.library_management_system_jwt.entity;


import jakarta.persistence.*;
import lombok.Data;


import java.util.Set;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;


    @ElementCollection(fetch = FetchType.EAGER)
    private Set<String> roles;
}
