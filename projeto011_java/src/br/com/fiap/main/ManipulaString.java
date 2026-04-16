package br.com.fiap.main;

public class ManipulaString {
    public static void main(String[] args) {
        String frase = "O rato roeu a roupa do rei de Roma";
        System.out.println(frase);
        System.out.println(frase.length());
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        System.out.println(frase.substring(30, 34));
        System.out.println(frase.replace("roupa", "parede"));
    }
}
