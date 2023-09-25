/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package functionalTestsJUnit5;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import com.mycompany.app.Boleto;
import com.mycompany.app.Fatura;
import com.mycompany.app.Processador;
import com.mycompany.app.SituacaoBoleto;


public class particaoTest {static class __CLR4_4_12626lmzj5b5l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0047\u0061\u0062\u0072\u0069\u0065\u006c\u005c\u005c\u0044\u006f\u0063\u0075\u006d\u0065\u006e\u0074\u0073\u005c\u005c\u0074\u0064\u0064\u005c\u005c\u0070\u0072\u006f\u0063\u0065\u0073\u0073\u0061\u0064\u006f\u0072\u0042\u006f\u006c\u0065\u0074\u006f\u0073\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1695685133596L,8589935092L,92,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
    @DisplayName("Teste Fatura n\u00e3o foi paga")
    public void testFaturaNaoPaga1() throws Exception {__CLR4_4_12626lmzj5b5l.R.globalSliceStart(getClass().getName(),78);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1fcmjiq26();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12626lmzj5b5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_12626lmzj5b5l.R.globalSliceEnd(getClass().getName(),"functionalTestsJUnit5.particaoTest.testFaturaNaoPaga1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),78,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1fcmjiq26() throws Exception{try{__CLR4_4_12626lmzj5b5l.R.inc(78);
            
        __CLR4_4_12626lmzj5b5l.R.inc(79);Processador processador = new Processador();
        __CLR4_4_12626lmzj5b5l.R.inc(80);processador.processarBoletos(boletos1, fatura);
    
        __CLR4_4_12626lmzj5b5l.R.inc(81);assertEquals(fatura.getSituacao(), SituacaoBoleto.NAO_PAGA);
    
    }finally{__CLR4_4_12626lmzj5b5l.R.flushNeeded();}}

    // Caso de teste 2
    @Test
    @DisplayName("Teste lista vazia como entrada")
    public void testErroListaVazia() throws Exception {__CLR4_4_12626lmzj5b5l.R.globalSliceStart(getClass().getName(),82);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1hhlg1z2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12626lmzj5b5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_12626lmzj5b5l.R.globalSliceEnd(getClass().getName(),"functionalTestsJUnit5.particaoTest.testErroListaVazia",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),82,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1hhlg1z2a() throws Exception{try{__CLR4_4_12626lmzj5b5l.R.inc(82);
        __CLR4_4_12626lmzj5b5l.R.inc(83);String msgFromException = "";

        __CLR4_4_12626lmzj5b5l.R.inc(84);try {
            __CLR4_4_12626lmzj5b5l.R.inc(85);processador.processarBoletos(boletos2, fatura);
        } catch (Exception e) {
            __CLR4_4_12626lmzj5b5l.R.inc(86);msgFromException = e.getMessage();
        }

        __CLR4_4_12626lmzj5b5l.R.inc(87);assertEquals("ERRO", msgFromException);
    }finally{__CLR4_4_12626lmzj5b5l.R.flushNeeded();}}

    // Caso de teste 3
    @Test
    @DisplayName("Teste Fatura foi paga")
    public void testFaturaPaga1() throws Exception {__CLR4_4_12626lmzj5b5l.R.globalSliceStart(getClass().getName(),88);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1nub7ow2g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_12626lmzj5b5l.R.rethrow($CLV_t2$);}finally{__CLR4_4_12626lmzj5b5l.R.globalSliceEnd(getClass().getName(),"functionalTestsJUnit5.particaoTest.testFaturaPaga1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),88,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1nub7ow2g() throws Exception{try{__CLR4_4_12626lmzj5b5l.R.inc(88);
        
        __CLR4_4_12626lmzj5b5l.R.inc(89);Processador processador = new Processador();
        __CLR4_4_12626lmzj5b5l.R.inc(90);processador.processarBoletos(boletos3, fatura);

        __CLR4_4_12626lmzj5b5l.R.inc(91);assertEquals(fatura.getSituacao(), SituacaoBoleto.PAGA);

    }finally{__CLR4_4_12626lmzj5b5l.R.flushNeeded();}}
}
