package com.example.trapezius.entity;

import lombok.*;

import javax.persistence.Id;

@Data
@AllArgsConstructor
public class User {

    @Id
    private String id;

    private String password;

    private String name;
}
