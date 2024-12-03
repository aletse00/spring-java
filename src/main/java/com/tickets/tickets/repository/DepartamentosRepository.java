package com.tickets.tickets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tickets.tickets.entity.Departamento;

public interface DepartamentosRepository extends JpaRepository<Departamento, Integer>{
    

}