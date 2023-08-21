package com.mycompany.app;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class PagamentoTest {
    @Test
    public void testPagamento() {
        Pagamento pagamento = new Pagamento(549.49, "17/03/2001", "BOLETO");
        
        // Verificando se a instância não é nula
        assertNotNull(pagamento);

    }
}
