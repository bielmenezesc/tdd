package com.mycompany.app;

import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.junit.Test;

public class PagamentoTest {
    @Test
    public void testPagamento() {
        Pagamento pagamento = new Pagamento(549.49, LocalDate.now(), "BOLETO");
        
        // Verificando se a instância não é nula
        assertNotNull(pagamento);

    }
}
