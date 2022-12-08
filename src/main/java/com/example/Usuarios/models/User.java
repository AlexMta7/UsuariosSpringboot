package com.example.Usuarios.models;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "user")
@Getter @Setter
@ToString @EqualsAndHashCode
public class User {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    //private String name;
    //private String name;

    
}
