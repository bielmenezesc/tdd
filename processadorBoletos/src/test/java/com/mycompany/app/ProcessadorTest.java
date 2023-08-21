package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProcessadorTest 
{
 
    @Test
    public void testProcessador() {

        Boleto[] boletos = {
        new Boleto("123456789", "2023-08-20", 150.50), 
        new Boleto("987654321", "2023-09-05", 75.25), 
        new Boleto("555888222", "2023-08-31", 1000.00),
        new Boleto("777999444", "2023-10-15", 250.75)
        };

        Fatura fatura = new Fatura("17/03/2001", 549.49, "Gabriel Menezes Cabral");

        Processador processador = new Processador();

        processador.processarBoletos(boletos, fatura);

        assertEquals(fatura.situacao, "PAGA");

    }
}
