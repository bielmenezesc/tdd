package functionalTestsJUnit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import com.mycompany.app.Boleto;
import com.mycompany.app.Fatura;
import com.mycompany.app.Processador;
import com.mycompany.app.SituacaoBoleto;


public class avlTest {
    static Boleto[] boletos1 = {};

    static Boleto[] boletos2 = {
        new Boleto("123456789", LocalDate.now(), 100.00), 
        new Boleto("987654321", LocalDate.now(), 500.00), 
        new Boleto("555888222", LocalDate.now(), 399.00)
    };

    static Boleto[] boletos3 = {
        new Boleto("123456789", LocalDate.now(), 100.00), 
        new Boleto("987654321", LocalDate.now(), 500.00), 
        new Boleto("555888222", LocalDate.now(), 400.00)
    };

    static Boleto[] boletos4 = {
        new Boleto("123456789", LocalDate.now(), 100.00), 
        new Boleto("987654321", LocalDate.now(), 500.00), 
        new Boleto("555888222", LocalDate.now(), 401.00)
    };

    static Boleto[] boletos5 = {
        new Boleto("123456789", LocalDate.now(), 500.00), 
        new Boleto("987654321", LocalDate.now(), 200.00)
    };

    static Boleto[] boletos6 = {
        new Boleto("123456789", LocalDate.now(), 1500.00), 
        new Boleto("987654321", LocalDate.now(), 200.00),
        new Boleto("987654321", LocalDate.now(), 600.00),
        new Boleto("987654321", LocalDate.now(), 800.00)
    };

    static Fatura fatura = new Fatura(LocalDate.now(), 1000.00, "Gabriel Menezes Cabral");

    Processador processador = new Processador();

    static Collection<Object[]> boletosFaturaPaga() {
        return Arrays.asList(
            new Object[] { boletos3, fatura},
            new Object[] { boletos4,  fatura},
            new Object[] { boletos6,  fatura}
        );
    }

    static Collection<Object[]> boletosFaturaNaoPaga() {
        return Arrays.asList(
            new Object[] { boletos2, fatura},
            new Object[] { boletos5,  fatura}
        );
    }

    @Test
    @DisplayName("Teste lista vazia como entrada")
    public void testErroListaVazia() throws Exception {
        String msgFromException = "";

        try {
            processador.processarBoletos(boletos1, fatura);
        } catch (Exception e) {
            msgFromException = e.getMessage();
        }

        assertEquals("ERRO", msgFromException);
    }

    @ParameterizedTest
    @MethodSource("boletosFaturaPaga")
    @DisplayName("Teste Fatura foi paga")
    public void testFaturaPaga(Boleto[] boletos, Fatura fatura) throws Exception {
        Processador processador = new Processador();
        processador.processarBoletos(boletos, fatura);
        assertEquals(SituacaoBoleto.PAGA, fatura.getSituacao());
    }

    @ParameterizedTest
    @MethodSource("boletosFaturaNaoPaga")
    @DisplayName("Teste Fatura não foi paga")
    public void testFaturaNaoPaga(Boleto[] boletos, Fatura fatura) throws Exception {
        Processador processador = new Processador();
        processador.processarBoletos(boletos, fatura);
        assertEquals(SituacaoBoleto.NAO_PAGA, fatura.getSituacao());
    }
}
