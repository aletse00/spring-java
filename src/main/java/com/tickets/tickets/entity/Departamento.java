package com.tickets.tickets.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;
@Data 

@Entity(name="departamento")
public class Departamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "departamento_id")
    private int id;
        
    @Column
    private String nombre_corto;
    
    @Column
    private String nombre_largo;

}
