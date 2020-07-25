package com.example.demotest3.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "contact" )
@Data
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String message;


}
