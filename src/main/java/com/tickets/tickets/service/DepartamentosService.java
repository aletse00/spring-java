package com.tickets.tickets.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tickets.tickets.entity.Departamento;
import com.tickets.tickets.repository.DepartamentosRepository;

@Service

public class DepartamentosService {
    @Autowired
    DepartamentosRepository departamentosRepository;
    
    public List<Departamento> findAll(){
        return departamentosRepository.findAll();
    }

    /**
     * @param id_departamento
     * @return
     */
    public Optional<Departamento> findById(int id_departamento){
        return departamentosRepository.findById(id_departamento);
    }
    
    public Departamento save(Departamento p){
        return departamentosRepository.save(p);
    }
}


