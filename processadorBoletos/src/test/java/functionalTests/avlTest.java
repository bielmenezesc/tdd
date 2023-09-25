package functionalTests;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import com.mycompany.app.Boleto;
import com.mycompany.app.Fatura;
import com.mycompany.app.Processador;
import com.mycompany.app.SituacaoBoleto;


public class avlTest {
    Boleto[] boletos1 = {};

    Boleto[] boletos2 = {
        new Boleto("123456789", LocalDate.now(), 100.00), 
        new Boleto("987654321", LocalDate.now(), 500.00), 
        new Boleto("555888222", LocalDate.now(), 399.00)
    };

    Boleto[] boletos3 = {
        new Boleto("123456789", LocalDate.now(), 100.00), 
        new Boleto("987654321", LocalDate.now(), 500.00), 
        new Boleto("555888222", LocalDate.now(), 400.00)
    };

    Boleto[] boletos4 = {
        new Boleto("123456789", LocalDate.now(), 100.00), 
        new Boleto("987654321", LocalDate.now(), 500.00), 
        new Boleto("555888222", LocalDate.now(), 401.00)
    };

    Boleto[] boletos5 = {
        new Boleto("123456789", LocalDate.now(), 500.00), 
        new Boleto("987654321", LocalDate.now(), 200.00)
    };

    Boleto[] boletos6 = {
        new Boleto("123456789", LocalDate.now(), 1500.00), 
        new Boleto("987654321", LocalDate.now(), 200.00),
        new Boleto("987654321", LocalDate.now(), 600.00),
        new Boleto("987654321", LocalDate.now(), 800.00)
    };

    Fatura fatura = new Fatura(LocalDate.now(), 1000.00, "Gabriel Menezes Cabral");

    Processador processador = new Processador();

    // Caso de teste 1
    @Test
    public void testErroListaVazia() throws Exception {
        String msgFromException = "";

        try {
            processador.processarBoletos(boletos1, fatura);
        } catch (Exception e) {
            msgFromException = e.getMessage();
        }

        assertEquals("ERRO", msgFromException);
    }

    // Caso de teste 2
    @Test
    public void testFaturaNaoPaga1() throws Exception {
        
        Processador processador = new Processador();
        processador.processarBoletos(boletos2, fatura);

        assertEquals(fatura.getSituacao(), SituacaoBoleto.NAO_PAGA);

    }

    // Caso de teste 3
    @Test
    public void testFaturaPaga1() throws Exception {
        
        Processador processador = new Processador();
        processador.processarBoletos(boletos3, fatura);

        assertEquals(fatura.getSituacao(), SituacaoBoleto.PAGA);

    }

    // Caso de teste 4
    @Test
    public void testFaturaPaga2() throws Exception {
        
        Processador processador = new Processador();
        processador.processarBoletos(boletos4, fatura);

        assertEquals(fatura.getSituacao(), SituacaoBoleto.PAGA);

    }

    // Caso de teste 5
    @Test
    public void testFaturaNaoPaga2() throws Exception {
        
        Processador processador = new Processador();
        processador.processarBoletos(boletos5, fatura);

        assertEquals(fatura.getSituacao(), SituacaoBoleto.NAO_PAGA);

    }

    // Caso de teste 6
    public void testFaturaPaga3() throws Exception {
        
        Processador processador = new Processador();
        processador.processarBoletos(boletos6, fatura);

        assertEquals(fatura.getSituacao(), SituacaoBoleto.PAGA);

    }
}
