package com.tickets.tickets.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tickets.tickets.entity.ProgramadorDepartamento;
import com.tickets.tickets.repository.ProgramadoresDepartamentosRepository;

@Service

public class ProgramadoresDepartamentosService {
    @Autowired
    ProgramadoresDepartamentosRepository programadoresDepartamentosRepository;
    
    public List<ProgramadorDepartamento> findAll1(){
        return programadoresDepartamentosRepository.findAll();
    }

    /**
     * @param id_maestro
     * @return
     */
    public Optional<ProgramadorDepartamento> findById(int id_maestro){
        return programadoresDepartamentosRepository.findById(id_maestro);
    }
    
    public ProgramadorDepartamento save(ProgramadorDepartamento m){
        return programadoresDepartamentosRepository.save(m);
    }

}

