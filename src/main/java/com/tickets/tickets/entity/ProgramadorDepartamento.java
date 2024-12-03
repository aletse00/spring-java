package com.tickets.tickets.entity;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data 
@Entity(name="programador_departamento")
public class ProgramadorDepartamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "materia_maestro_id")
    private int id;

    @ManyToOne
    private Programador programador;

    @ManyToOne
    private Departamento departamento;

    @Column
    private String descripcion;

    @Column(columnDefinition = "TIME")
    private LocalTime hora;

    @Column
    private boolean status;

}
