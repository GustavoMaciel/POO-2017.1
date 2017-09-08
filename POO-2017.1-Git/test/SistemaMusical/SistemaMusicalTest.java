package SistemaMusical;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gmnun
 */
public class SistemaMusicalTest {
    
    @Test
    public void testaTudo(){
        SistemaMusical sys = new SistemaMusical();
        Instrumento violao = new Violao("Gibson", "A", 970.90, 3);
        Instrumento guit = new Guitarra("Gibson", "B", 1350, 3);
        Instrumento bat = new Bateria("Ludwig", "C", 1400, 2);
        Funcionario ana = new Funcionario("Ana Lúcia", "ana@duart.com", "1", 1300);
        
        try{
            sys.cadastrarInstrumento(violao);
            sys.cadastrarInstrumento(guit);
            sys.cadastrarInstrumento(bat);
            sys.cadastrarFuncionario(ana);
        }catch(Exception e){
            fail(e.getMessage());
        }
        
        assertEquals(sys.getInstrumentos().size(), 3);
        assertEquals(sys.getFuncionarios().size(), 1);
        
        try{
            sys.cadastrarInstrumento(violao);
            fail("Cadastrou repetido o Violão.");
            sys.cadastrarFuncionario(ana);
            fail("Cadastrou repetido Ana.");
        }catch(Exception e){
        }
        
        try{
            sys.comprarInstrumento("A", 3);
        }
        catch(Exception e){
            fail(e.getMessage());
        }
        assertEquals(sys.getCaixa(), violao.getValor(), 0.01);
        
         try{
            sys.comprarInstrumento("A", 1);
            fail("Não era para ter comprado.");
        }
        catch(Exception e){
        }
         
         try{
             sys.removerFuncionario(ana);
             sys.removerInstrumento(bat);
         }catch(Exception e){
             fail(e.getMessage());
         }
         assertEquals(sys.getFuncionarios().size(), 0);
         assertEquals(sys.getInstrumentos().size(), 2);
    }
}
