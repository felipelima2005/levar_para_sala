package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan;
        DespesaFamiliar despesa;
        try {
            //Instanciação das calsses
            scan = new Scanner(System.in);
            despesa = new DespesaFamiliar();
            System.out.println("Qual é a sua renda familiar: ");
            despesa.rendaFamiliar = scan.nextDouble();
            System.out.println("Qual é o número de moradores da sua casa: ");
            despesa.numeroDeMoradores = scan.nextInt();
            System.out.println("Qual é o valor da sua conta luz: ");
            despesa.gastoComLuz = scan.nextDouble();
            System.out.println("Qual é o valor da sua conta de água: ");
            despesa.gastoComAgua = scan.nextDouble();
            System.out.println("Qual é o valor da sua conta de internet: ");
            despesa.gastoComInternet = scan.nextDouble();
            System.out.println("Qual é o valor da mensalidade da sua academia: ");
            despesa.valorMensalidadeDaAcademia = scan.nextDouble();


            System.out.printf("Renda Bruta: %.3f \nTotal de Despesa: %.3f \nRenda Liquída: %.3f",despesa.rendaFamiliar,despesa.caucularTotalDeDespesa(),despesa.caucularRendaFamiliarLiquida());


        }catch (Exception e){
            System.out.println("Entrada incorreta!!");

        }
    }
}
