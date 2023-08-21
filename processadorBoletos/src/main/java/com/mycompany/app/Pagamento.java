package com.mycompany.app;

public class Pagamento {

    private Double valor;
    private String data;
    private String tipoPagamento;

    public Pagamento(Double valor, String data, String tipoPagamento) {
        this.data = data;
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
    }

}
