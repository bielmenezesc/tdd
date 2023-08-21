package com.mycompany.app;

import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.junit.Test;

public class FaturaTest {
    @Test
    public void testFatura() {
        Fatura fatura = new Fatura(LocalDate.now(), 549.49, "Gabriel Menezes Cabral");
        
        // Verificando se a instância não é nula
        assertNotNull(fatura);

    }
}
