/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package functionalTestsJUnit5;

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


public class avlTest {static class __CLR4_4_11o1olmzj5azh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0047\u0061\u0062\u0072\u0069\u0065\u006c\u005c\u005c\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u005c\u005c\u0074\u0064\u0064\u005c\u005c\u0070\u0072\u006f\u0063\u0065\u0073\u0073\u0061\u0064\u006f\u0072\u0042\u006f\u006c\u0065\u0074\u006f\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1695685133596L,8589935092L,78,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=new com_atlassian_clover.TestNameSniffer.Simple();
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

    static Collection<Object[]> boletosFaturaPaga() {try{__CLR4_4_11o1olmzj5azh.R.inc(60);
        __CLR4_4_11o1olmzj5azh.R.inc(61);return Arrays.asList(
            new Object[] { boletos3, fatura},
            new Object[] { boletos4,  fatura},
            new Object[] { boletos6,  fatura}
        );
    }finally{__CLR4_4_11o1olmzj5azh.R.flushNeeded();}}

    static Collection<Object[]> boletosFaturaNaoPaga() {try{__CLR4_4_11o1olmzj5azh.R.inc(62);
        __CLR4_4_11o1olmzj5azh.R.inc(63);return Arrays.asList(
            new Object[] { boletos2, fatura},
            new Object[] { boletos5,  fatura}
        );
    }finally{__CLR4_4_11o1olmzj5azh.R.flushNeeded();}}

    @Test
    @DisplayName("Teste lista vazia como entrada")
    public void testErroListaVazia() throws Exception {__CLR4_4_11o1olmzj5azh.R.globalSliceStart(getClass().getName(),64);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hhlg1z1s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o1olmzj5azh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o1olmzj5azh.R.globalSliceEnd(getClass().getName(),"functionalTestsJUnit5.avlTest.testErroListaVazia",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),64,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hhlg1z1s() throws Exception{try{__CLR4_4_11o1olmzj5azh.R.inc(64);
        __CLR4_4_11o1olmzj5azh.R.inc(65);String msgFromException = "";

        __CLR4_4_11o1olmzj5azh.R.inc(66);try {
            __CLR4_4_11o1olmzj5azh.R.inc(67);processador.processarBoletos(boletos1, fatura);
        } catch (Exception e) {
            __CLR4_4_11o1olmzj5azh.R.inc(68);msgFromException = e.getMessage();
        }

        __CLR4_4_11o1olmzj5azh.R.inc(69);assertEquals("ERRO", msgFromException);
    }finally{__CLR4_4_11o1olmzj5azh.R.flushNeeded();}}

    @ParameterizedTest
    @MethodSource("boletosFaturaPaga")
    @DisplayName("Teste Fatura foi paga")
    public void testFaturaPaga(Boleto[] boletos, Fatura fatura) throws Exception {__CLR4_4_11o1olmzj5azh.R.globalSliceStart(getClass().getName(),70);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1rwg18l1y(boletos,fatura);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o1olmzj5azh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o1olmzj5azh.R.globalSliceEnd(getClass().getName(),"functionalTestsJUnit5.avlTest.testFaturaPaga",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),70,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1rwg18l1y(Boleto[] boletos, Fatura fatura) throws Exception{try{__CLR4_4_11o1olmzj5azh.R.inc(70);
        __CLR4_4_11o1olmzj5azh.R.inc(71);Processador processador = new Processador();
        __CLR4_4_11o1olmzj5azh.R.inc(72);processador.processarBoletos(boletos, fatura);
        __CLR4_4_11o1olmzj5azh.R.inc(73);assertEquals(SituacaoBoleto.PAGA, fatura.getSituacao());
    }finally{__CLR4_4_11o1olmzj5azh.R.flushNeeded();}}

    @ParameterizedTest
    @MethodSource("boletosFaturaNaoPaga")
    @DisplayName("Teste Fatura n\u00e3o foi paga")
    public void testFaturaNaoPaga(Boleto[] boletos, Fatura fatura) throws Exception {__CLR4_4_11o1olmzj5azh.R.globalSliceStart(getClass().getName(),74);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jiwqzd22(boletos,fatura);$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_11o1olmzj5azh.R.rethrow($CLV_t2$);}finally{__CLR4_4_11o1olmzj5azh.R.globalSliceEnd(getClass().getName(),"functionalTestsJUnit5.avlTest.testFaturaNaoPaga",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),74,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jiwqzd22(Boleto[] boletos, Fatura fatura) throws Exception{try{__CLR4_4_11o1olmzj5azh.R.inc(74);
        __CLR4_4_11o1olmzj5azh.R.inc(75);Processador processador = new Processador();
        __CLR4_4_11o1olmzj5azh.R.inc(76);processador.processarBoletos(boletos, fatura);
        __CLR4_4_11o1olmzj5azh.R.inc(77);assertEquals(SituacaoBoleto.NAO_PAGA, fatura.getSituacao());
    }finally{__CLR4_4_11o1olmzj5azh.R.flushNeeded();}}
}
