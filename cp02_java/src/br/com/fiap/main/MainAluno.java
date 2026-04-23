package br.com.fiap.main;

import br.com.fiap.bean.Aluno;

import javax.swing.*;
import java.time.LocalDate;

public class MainAluno {
    public static void main(String[] args) {
        // aluno 01 com construtor vazio
        Aluno aluno1 = new Aluno();
        String ano = "2006";
        String mes = "08";
        String dia = "15";
        String eua = ano + "-" + mes + "-" + dia;
        aluno1.setDataDeNascimento(LocalDate.parse(eua));
        aluno1.setNomeCompleto("Giovanni Zorzetto Oliveira");
        aluno1.setRegistroMatricula(569464);

        // aluno 02 com construtor vazio
        Aluno aluno2 = new Aluno();
        String ano2 = "2007";
        String mes2 = "07";
        String dia2 = "02";
        String america = ano2 + "-" + mes2 + "-" + dia2;
        aluno2.setDataDeNascimento(LocalDate.parse(america));
        aluno2.setNomeCompleto("Raphael Gomes Brito");
        aluno2.setRegistroMatricula(572637);

        // aluno 03 e aluno 04 com construtor com passagem de parametro
        Aluno aluno3;
        Aluno aluno4;
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataNascimento;
        String auxiliar, nome;
        int rm;
        try{
            //aluno 03
            nome = JOptionPane.showInputDialog("Nome aluno 03: ");
            auxiliar = JOptionPane.showInputDialog("Qual o RM do aluno 03: ");
            rm = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual a data de nascimento do aluno 03 no formato (dia/mes/ano): ");
            dia = auxiliar.substring(0,2);
            mes = auxiliar.substring(3,5);
            ano = auxiliar.substring(6,10);
            eua = ano + "-" + mes + "-" + dia;
            dataNascimento = LocalDate.parse(eua);
            aluno3 = new Aluno(rm, nome,dataNascimento);

            //aluno 04
            nome = JOptionPane.showInputDialog("Nome aluno 04: ");
            auxiliar = JOptionPane.showInputDialog("Qual o RM do aluno 04: ");
            rm = Integer.parseInt(auxiliar);
            auxiliar = JOptionPane.showInputDialog("Qual a data de nascimento do aluno 04 no formato (dia/mes/ano): ");
            dia = auxiliar.substring(0,2);
            mes = auxiliar.substring(3,5);
            ano = auxiliar.substring(6,10);
            eua = ano + "-" + mes + "-" + dia;
            dataNascimento = LocalDate.parse(eua);
            aluno4 = new Aluno(rm, nome,dataNascimento);

            // saida de dados
            JOptionPane.showMessageDialog(null, String.format("---Aluno 01--- \nNome: %s \nRM: %d \nIdade: %s ", aluno1.getNomeCompleto(), aluno1.getRegistroMatricula(), aluno1.caucularIdadeCompleta(dataAtual)));
            JOptionPane.showMessageDialog(null, String.format("---Aluno 02--- \nNome: %s \nRM: %d \nIdade: %s ", aluno2.getNomeCompleto(), aluno2.getRegistroMatricula(), aluno2.caucularIdadeCompleta(dataAtual)));
            JOptionPane.showMessageDialog(null, String.format("---Aluno 03--- \nNome: %s \nRM: %d \nIdade: %s ", aluno3.getNomeCompleto(), aluno3.getRegistroMatricula(), aluno3.caucularIdadeCompleta(dataAtual)));
            JOptionPane.showMessageDialog(null, String.format("---Aluno 04--- \nNome: %s \nRM: %d \nIdade: %s ", aluno4.getNomeCompleto(), aluno4.getRegistroMatricula(), aluno4.caucularIdadeCompleta(dataAtual)));


        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

    }
}
