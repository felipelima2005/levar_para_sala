package br.com.fiap.main.praticando;

import java.util.Scanner;

public class PraticandoString {
    public static void main(String[] args) {
        String frase, sub ,correcao;
        Scanner scan;
        try {
            scan = new Scanner(System.in);
            System.out.println("Digite uma frase: ");
            frase = scan.nextLine();
            System.out.println(frase);
            System.out.println(frase.length());
            System.out.println(frase.toUpperCase());
            System.out.println("Digite uma palavra para ser alterada : ");
            sub = scan.next();
            System.out.println("E agora sua correção : ");
            correcao = scan.next();
            System.out.println(frase.replace(sub, correcao));
            System.out.println(frase.length());


        } catch (Exception e) {
            System.out.println("Entrada Inconpativel");
        }
    }
}
