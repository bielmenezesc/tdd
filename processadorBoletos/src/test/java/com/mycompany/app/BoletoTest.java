package com.mycompany.app;

import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.junit.Test;

public class BoletoTest {

    @Test
    public void testBoleto() {
        Boleto boleto = new Boleto("123456789", LocalDate.now(), 150.50);
        
        // Verificando se a instância não é nula
        assertNotNull(boleto);

    }

}
