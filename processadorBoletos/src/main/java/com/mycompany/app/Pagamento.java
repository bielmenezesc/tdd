package com.mycompany.app;

import java.time.LocalDate;

public class Pagamento {

    private Double valor;
    private LocalDate data;
    private String tipoPagamento;
    private Boleto boleto;
    private Fatura fatura;

    public Pagamento(Double valor, LocalDate data, String tipoPagamento, Boleto boleto, Fatura fatura) {
        this.data = data;
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
        this.boleto = boleto;
        this.fatura = fatura;
    }

}
