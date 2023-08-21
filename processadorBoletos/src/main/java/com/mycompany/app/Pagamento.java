package com.mycompany.app;

import java.time.LocalDate;

public class Pagamento {

    private Double valor;
    private LocalDate data;
    private String tipoPagamento;

    public Pagamento(Double valor, LocalDate data, String tipoPagamento) {
        this.data = data;
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
    }

}
