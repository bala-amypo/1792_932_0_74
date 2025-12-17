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

     public StudentEntity(Long id, String name, String email, float cgpa) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cgpa = cgpa;
     }

     public StudentEntity() {
        
     }

     public void setName(string name) {
         this.name;
     }

     public void getName(string name) {
        return this.name;
     }

     public void setEmail(string email) {
         this.email;
     }

     public void getEmail(string email) {
        return this.email;
     }

     public void setcgpa(flaot cgpa) {
        this.cgpa;
     }

     public void getcgpa(float cgpa) {
        return this.cgpap;
     }

}



