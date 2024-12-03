package com.tickets.tickets.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="programador")
public class Programador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "programador_id")
    private int id;
        
    @Column
    private String nombre;
    
    @Column(unique=true)
    private String rfc;

}
