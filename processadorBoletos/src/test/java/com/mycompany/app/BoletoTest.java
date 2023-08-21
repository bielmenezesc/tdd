package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BoletoTest {

    @Test
    public void testImprimirMensagem() {
        Boleto boleto = new Boleto("xxxxxxxxxx", "17/03/2001", "R$549,49");
        assertNotNull(boleto);
    }

}
