package com.mycompany.app;

import java.time.LocalDate;

public class Processador {

    public void processarBoletos(Boleto[] boletos, Fatura fatura) {
        Double somaBoletos = 0.0;

        for (int i = 0; i < boletos.length; i++) {
            Boleto boleto = boletos[i];
            somaBoletos += boleto.getValor();
            new Pagamento(boleto.getValor(), LocalDate.now(), TipoPagamento.BOLETO, boleto, fatura);
        }

        if (somaBoletos >= fatura.getValor()) {
            fatura.setFaturaPaga();
        }
    }
}