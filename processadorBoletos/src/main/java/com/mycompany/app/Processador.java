package com.mycompany.app;

public class Processador {

    public void processarBoletos(Boleto[] boletos, Fatura fatura) {
        Double somaBoletos = 0.0;

        for (int i = 0; i < boletos.length; i++) {
            Boleto boleto = boletos[i];
            somaBoletos += boleto.valor;
            Pagamento pagamento = new Pagamento(boleto.valor, "17/03/2001", "BOLETO");
        }

        if (somaBoletos >= fatura.valor) {
            fatura.setFaturaPaga();
        }
    }
}