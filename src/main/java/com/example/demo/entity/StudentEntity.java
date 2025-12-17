package com.example.demo.entity;

import jakarta.presistence.Entity; 
import jakarta.presistence.Generatedvalue;
import jakarta.presistence.GeneratedType;
import jakarta.presistence.Id;

@Entity
public class StudentEntity {

    @Id
    @Generatedvalue(strategy = GeneratedType.IDENTITY)
     private Long Id;
     private string name;
     private string email;
     private float cgpa;

     public void setName(string name) {
        return this.name;
     }

     public void getNmae(string name) {
        return this.name;
     }

     public void setE

}



