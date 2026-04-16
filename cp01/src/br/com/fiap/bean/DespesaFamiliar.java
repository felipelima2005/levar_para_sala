package br.com.fiap.bean;

public class DespesaFamiliar {
    //atributos
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;

    //metodos
    public double caucularTotalDeDespesa(){
        double despesas = gastoComLuz + gastoComInternet + gastoComAgua + (numeroDeMoradores*valorMensalidadeDaAcademia);
        return despesas;
    }

    public double caucularRendaFamiliarLiquida(){
        double liquido = rendaFamiliar - caucularTotalDeDespesa();
        return liquido;
    }
}
