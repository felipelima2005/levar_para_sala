package br.com.fiap.bean;


//Felipe Lima - Rm569947
//Giovanni Zorzetto - Rm569464
//Raphael Gomes - Rm572637


import java.time.LocalDate;
import java.time.Period;


public class Aluno {
    //atributos da classe
    int registroMatricula;
    String nomeCompleto;
    LocalDate dataDeNascimento;

    //construtores
    public Aluno() {
    }

    public Aluno(int registroMatricula, String nomeCompleto, LocalDate dataDeNascimento) {
        this.registroMatricula = registroMatricula;
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
    }

    //metodos get/set
    public int getRegistroMatricula() {
        return registroMatricula;
    }
    public void setRegistroMatricula(int registroMatricula) {
        this.registroMatricula = registroMatricula;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }
    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    //metodos da classe
    public String caucularIdadeCompleta(LocalDate dataAtual){
        dataAtual = LocalDate.now();
        Period idade =  ;
        return idade.between(dataDeNascimento,dataAtual);


    }
}
