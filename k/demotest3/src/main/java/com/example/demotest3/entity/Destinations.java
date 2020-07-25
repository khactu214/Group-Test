package com.example.demotest3.entity;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;



@Entity
@Data

public class Destinations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank(message = "Not empty.")
    @Size(min = 8, message = "Than 8 characters.")
    private String name;
    private String imgUrl;
    @Min(1)
    private int price;
    private int status; //0.Deleted 1.Active
    private Long createdAt;

    public Destinations() {
        this.status = 1;
    }

    public Destinations(@NotNull @Size(min = 8) String name, String imgUrl, @Min(1) int price) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.price = price;
        this.createdAt = System.currentTimeMillis();
        this.status = 1;
    }
}