package com.mycompany.app;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class FaturaTest {
    @Test
    public void testFatura() {
        FaturaTest fatura = new Fatura("17/03/2001", 549.49, "Gabriel Menezes Cabral");
        
        // Verificando se a instância não é nula
        assertNotNull(fatura);

    }
}
