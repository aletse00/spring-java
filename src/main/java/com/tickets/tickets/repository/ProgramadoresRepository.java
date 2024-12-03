package com.tickets.tickets.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tickets.tickets.entity.Programador;

public interface ProgramadoresRepository extends JpaRepository<Programador, Integer>{
    
}
