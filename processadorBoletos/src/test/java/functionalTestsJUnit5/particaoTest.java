package functionalTestsJUnit5;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import com.mycompany.app.Boleto;
import com.mycompany.app.Fatura;
import com.mycompany.app.Processador;
import com.mycompany.app.SituacaoBoleto;


public class particaoTest {

    Boleto[] boletos1 = {
        new Boleto("123456789", LocalDate.now(), 200.00), 
        new Boleto("987654321", LocalDate.now(), 100.00), 
        new Boleto("555888222", LocalDate.now(), 400.00)
    };

    Boleto[] boletos2 = {};

    Boleto[] boletos3 = {
        new Boleto("123456789", LocalDate.now(), 1500.00), 
        new Boleto("987654321", LocalDate.now(), 2000.00), 
        new Boleto("555888222", LocalDate.now(), 1700.00),
        new Boleto("555888222", LocalDate.now(), 2400.00)
    };

    Fatura fatura = new Fatura(LocalDate.now(), 1000.00, "Gabriel Menezes Cabral");

    Processador processador = new Processador();

    // Caso de teste 1
    @Test
    @DisplayName("Teste Fatura não foi paga")
    public void testFaturaNaoPaga1() throws Exception {
            
        Processador processador = new Processador();
        processador.processarBoletos(boletos1, fatura);
    
        assertEquals(fatura.getSituacao(), SituacaoBoleto.NAO_PAGA);
    
    }

    // Caso de teste 2
    @Test
    @DisplayName("Teste lista vazia como entrada")
    public void testErroListaVazia() throws Exception {
        String msgFromException = "";

        try {
            processador.processarBoletos(boletos2, fatura);
        } catch (Exception e) {
            msgFromException = e.getMessage();
        }

        assertEquals("ERRO", msgFromException);
    }

    // Caso de teste 3
    @Test
    @DisplayName("Teste Fatura foi paga")
    public void testFaturaPaga1() throws Exception {
        
        Processador processador = new Processador();
        processador.processarBoletos(boletos3, fatura);

        assertEquals(fatura.getSituacao(), SituacaoBoleto.PAGA);

    }
}
