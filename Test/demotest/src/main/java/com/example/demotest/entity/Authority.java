package com.example.demotest.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tb_authority")
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
}
