package com.mycompany.app;

public class Fatura {

    private String data;
    private Double valor;
    private String nomeCliente;

    public Fatura(String data, Double valor, String nomeCliente) {
        this.data = data;
        this.valor = valor;
        this.nomeCliente = nomeCliente;
    }

}
