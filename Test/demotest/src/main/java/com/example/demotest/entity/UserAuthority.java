package com.example.demotest.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "tb_user_authority")
public class UserAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Id
    private String authority_name;



}
