package br.com.fiap.to;

import java.time.LocalDate;

public class RemedioTO {
    //atributos
    private Long codigo;
    private String nome;
    private double preco;
    private LocalDate dataDeFabricacao;
    private LocalDate dataDeValidade;

    //construtores

    public RemedioTO() {
    }

    public RemedioTO(Long codigo, String nome, double preco, LocalDate dataDeFabricacao, LocalDate dataDeValidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.dataDeFabricacao = dataDeFabricacao;
        this.dataDeValidade = dataDeValidade;
    }

    //metodos get/set

    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public LocalDate getDataDeFabricacao() {
        return dataDeFabricacao;
    }
    public void setDataDeFabricacao(LocalDate dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }
    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }
    public void setDataDeValidade(LocalDate dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }

    //metodos da classe
}
