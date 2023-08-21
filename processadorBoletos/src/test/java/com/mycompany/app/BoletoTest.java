package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BoletoTest {

    @Test
    public void testBoleto() {
        Boleto boleto = new Boleto("xxxxxxxxxx", "17/03/2001", 549.49);
        
        // Verificando se a instância não é nula
        assertNotNull(boleto);

    }

}
