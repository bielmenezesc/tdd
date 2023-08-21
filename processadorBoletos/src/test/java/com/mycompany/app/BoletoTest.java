package com.mycompany.app;

import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.junit.Test;

public class BoletoTest {

    @Test
    public void testBoleto() {
        Boleto boleto = new Boleto("xxxxxxxxxx", LocalDate.now(), 549.49);
        
        // Verificando se a instância não é nula
        assertNotNull(boleto);

    }

}
