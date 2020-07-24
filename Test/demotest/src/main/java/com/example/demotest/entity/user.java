package com.example.demotest.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tbuser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private String name;

    private String address;

    private String email;

    public boolean checkLogin(){
        if (username != null && !username.equals("tbuser")){

            return true;
        }
        return false;
    }
}
