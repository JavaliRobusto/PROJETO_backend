package com.castelo.projeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.castelo.projeto.DTO.ProfessorDTO;
import com.castelo.projeto.modelo.Professor;

public class ProfessorController {
    @GetMapping(value = "/")
    public String imprimir() {
        return "texto";

    }
    @PostMapping(value = "/API/professor/" )
    public void create (ProfessorDTO professorDTO){

        Professor professor = professorDTO.novoProfessor();
        System.out.println(professor.toString());
    }
}
