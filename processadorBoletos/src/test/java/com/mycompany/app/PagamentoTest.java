package com.mycompany.app;

import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.junit.Test;

public class PagamentoTest {
    @Test
    public void testPagamento() {
        Pagamento pagamento = new Pagamento(549.49, LocalDate.now(), TipoPagamento.BOLETO, 
        new Boleto("123456789", LocalDate.now(), 150.50),
        new Fatura(LocalDate.now(), 549.49, "Gabriel Menezes Cabral"));
        
        // Verificando se a instância não é nula
        assertNotNull(pagamento);

    }
}
