package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class ProcessadorTest 
{
 
    @Test
    public void testProcessador() {

        Boleto[] boletos = {
        new Boleto("123456789", LocalDate.now(), 150.50), 
        new Boleto("987654321", LocalDate.now(), 75.25), 
        new Boleto("555888222", LocalDate.now(), 1000.00),
        new Boleto("777999444", LocalDate.now(), 250.75)
        };

        Fatura fatura = new Fatura(LocalDate.now(), 549.49, "Gabriel Menezes Cabral");

        Processador processador = new Processador();

        processador.processarBoletos(boletos, fatura);

        assertEquals(fatura.situacao, "PAGA");

    }
}
