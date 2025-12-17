package com.example.demo.entity;

import jakarta.presistence.Entity;
import jakarta.presistence.Id;

@Entity
public class StudentEntity {

    @Id
    @Generatedvalue(strategy=Generatedvalue)
     private Long Id;
     private string name;
     private string email;
     private float cgpa;

}


