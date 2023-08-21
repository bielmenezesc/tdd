package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ProcessadorTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testProcessador() {

        Boleto[] boletos = {
        new Boleto("123456789", "2023-08-20", 150.50), 
        new Boleto("987654321", "2023-09-05", 75.25), 
        new Boleto("555888222", "2023-08-31", 1000.00),
        new Boleto("777999444", "2023-10-15", 250.75)
        };

        Fatura fatura = new Fatura("17/03/2001", 549.49, "Gabriel Menezes Cabral");

        Double somaBoletos = 0.0;

        for (int i = 0; i < boletos.length; i++) {
            Boleto boleto = boletos[i];
            somaBoletos += boleto.valor;
        }

        if (fatura.valor <= somaBoletos) {
            assertEquals(fatura.situacao, "PAGA");
        } else {
            assertEquals(fatura.situacao, "NAO PAGA");
        }

    }
}
