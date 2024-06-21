package com.castelo.projeto.DTO;

import com.castelo.projeto.modelo.Professor;

public class ProfessorDTO {
    
    private String nome;
    private int idade;
    
    public ProfessorDTO() {
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Professor  novoProfessor() {
       return new Professor(this.nome, this.idade);
    }
    
    
}
