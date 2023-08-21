package com.mycompany.app;

public class Boleto {

    private String codigo;
    private String data;
    Double valor;

    public Boleto(String codigo, String data, Double valor) {
        this.codigo = codigo;
        this.data = data;
        this.valor = valor;
    }

}
