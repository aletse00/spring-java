package com.tickets.tickets.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tickets.tickets.entity.ProgramadorDepartamento;

public interface ProgramadoresDepartamentosRepository extends JpaRepository<ProgramadorDepartamento, Integer>{
    
}