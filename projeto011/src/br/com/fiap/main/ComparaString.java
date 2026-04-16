package br.com.fiap.main;

import java.util.Scanner;

public class ComparaString {
    public static void main(String[] args) {
        String senha;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua senha: ");
        senha = scan.next();
        //Verificando Strings paraver se são identicas
        //é necessario ser identico para dar verdadeiro tanto maiuscula como minuscula
        if (senha.equals("P4ssw0rD")) {
            System.out.println("Teste 1 : Acesso concedido! ");
        }else {
            System.out.println("Teste 1 : Acesso negado!");
        }
        //Verificando Strings paraver se são iguais
        //ignora se é maiuscula ou minuscula
        if (senha.equalsIgnoreCase("P4ssw0rD")) {
            System.out.println("Teste 2 : Acesso autorizado! ");
        }else {
            System.out.println("Teste 2 : Acesso proibido!");
        }

    }
}
