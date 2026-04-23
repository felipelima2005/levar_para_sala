package br.com.fiap.bean;


//Felipe Lima - Rm569947
//Giovanni Zorzetto - Rm569464
//Raphael Gomes - Rm572637


import javax.swing.*;
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
       setRegistroMatricula(registroMatricula);
        this.nomeCompleto = nomeCompleto;
        setDataDeNascimento(dataDeNascimento);
    }

    //metodos get/set
    public int getRegistroMatricula() {
        return registroMatricula;
    }
    public void setRegistroMatricula(int registroMatricula) {
        try{
            if (registroMatricula >= 8000 && registroMatricula <= 599999) {
                this.registroMatricula = registroMatricula;
            }else {
                throw new Exception("Matricula fora da faixa permitida");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
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
        try{
            LocalDate atual = LocalDate.now().plusDays(1);
            LocalDate dataInicial = LocalDate.parse("1959-12-31");
            if (dataDeNascimento.isAfter(dataInicial) && dataDeNascimento.isBefore(atual)){
                this.dataDeNascimento = dataDeNascimento;

            }else {
                throw new Exception("Data fora da faixa permitida");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
            System.exit(0);
        }
    }

    //metodos da classe
    public String caucularIdadeCompleta(LocalDate dataAtual){
        Period idade = Period.between(dataDeNascimento, dataAtual);
        String completa = String.format(idade.getYears() + " anos, " + idade.getMonths() + " meses, " + idade.getDays() + " dias.");
        return completa;


    }
}
