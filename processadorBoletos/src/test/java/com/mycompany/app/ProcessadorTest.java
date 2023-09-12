package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class ProcessadorTest {
 
    Boleto[] boletos1 = {
        new Boleto("123456789", LocalDate.now(), 150.50), 
        new Boleto("987654321", LocalDate.now(), 75.25), 
        new Boleto("555888222", LocalDate.now(), 1000.00),
        new Boleto("777999444", LocalDate.now(), 250.75)
    };

    Boleto[] boletos2 = {
        new Boleto("123456789", LocalDate.now(), 150.50), 
        new Boleto("987654321", LocalDate.now(), 75.25), 
        new Boleto("555888222", LocalDate.now(), 10.00),
        new Boleto("777999444", LocalDate.now(), 250.75)
    };

    Fatura fatura = new Fatura(LocalDate.now(), 549.49, "Gabriel Menezes Cabral");

    @Test
    public void testFaturaPaga() throws Exception {
        
        Processador processador = new Processador();
        processador.processarBoletos(boletos1, fatura);

        assertEquals(fatura.getSituacao(), SituacaoBoleto.PAGA);

    }

    @Test
    public void testFaturaNaoPaga() throws Exception {
        
        Processador processador = new Processador();
        processador.processarBoletos(boletos2, fatura);

        assertEquals(fatura.getSituacao(), SituacaoBoleto.NAO_PAGA);

    }
}
