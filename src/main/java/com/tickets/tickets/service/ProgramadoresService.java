package com.tickets.tickets.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tickets.tickets.entity.Programador;
import com.tickets.tickets.repository.ProgramadoresRepository;

@Service

public class ProgramadoresService {
    @Autowired
    ProgramadoresRepository programadoresRepository;
    
    public List<Programador> findAll(){
        return programadoresRepository.findAll();
    }

    /**
     * @param id_programador
     * @return
     */
    public Optional<Programador> findById(int id_programador){
        return programadoresRepository.findById(id_programador);
    }
    
    public Programador save(Programador p){
        return programadoresRepository.save(p);
    }
}


