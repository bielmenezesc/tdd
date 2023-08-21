package com.mycompany.app;

import java.time.LocalDate;

public class Fatura {

    private LocalDate data;
    Double valor;
    private String nomeCliente;
    String situacao;

    public Fatura(LocalDate data, Double valor, String nomeCliente) {
        this.data = data;
        this.valor = valor;
        this.nomeCliente = nomeCliente;
        this.situacao = "NAO PAGA";
    }

    public void setFaturaPaga() {
       this.situacao = "PAGA";
    }

}
