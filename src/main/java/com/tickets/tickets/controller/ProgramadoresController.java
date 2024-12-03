package com.tickets.tickets.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tickets.tickets.entity.Programador;
import com.tickets.tickets.service.ProgramadoresService;


@RestController
@RequestMapping("/programadores")

public class ProgramadoresController {
    @Autowired
    ProgramadoresService programadoresService;

    @GetMapping("/")
    public List<Programador> getAll() {
        return programadoresService.findAll();
    }

    @GetMapping(value = "/id/{id_programador}")
    public Optional<Programador> findById(@PathVariable Integer id_programador) {
        return programadoresService.findById(id_programador);
    }
    
    @PostMapping("/")
    public Programador postMethodName(@RequestBody Programador programador) {        
        return programadoresService.save(programador);
    }
    
}
    

