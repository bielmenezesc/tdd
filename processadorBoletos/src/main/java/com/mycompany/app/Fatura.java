package com.mycompany.app;

import java.time.LocalDate;

public class Fatura {

    private LocalDate data;
    private Double valor;
    private String nomeCliente;
    private SituacaoBoleto situacao;

    public Fatura(LocalDate data, Double valor, String nomeCliente) {
        this.data = data;
        this.valor = valor;
        this.nomeCliente = nomeCliente;
        this.situacao = SituacaoBoleto.NAO_PAGA;
    }

    public void setFaturaPaga() {
       this.situacao = SituacaoBoleto.PAGA;
    }

    public Double getValor() {
        return valor;
    }

    public void subtraiValor(Double valorBoleto) {
        this.valor -= valorBoleto;
    }

    public SituacaoBoleto getSituacao() {
        return situacao;
    }

}
