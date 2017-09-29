package Classes;

import Exceptions.InstrumentoInexistenteException;
import Exceptions.InstrumentoJaExisteException;
import Exceptions.QuantiaInvalidaException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gustavo
 */
public class SistemaLojaMusicalTest {
    
    public SistemaLojaMusicalTest() {
    }

    @Test
    public void testEverythingAtOnce() {
        SistemaLojaMusical sys = new SistemaLojaMusical();
        Instrumento x = new Instrumento();
        x.setValor(1200);
        x.setNumeroSerie("0");
        
        Funcionario ana = new Funcionario();
        ana.setId("0");
        
        Cliente aug = new Cliente();
        aug.setEmail("@");
        
        try{
            sys.cadastrarInstrumento(x);
            sys.cadastrarCliente(aug);
            sys.cadastrarFuncionario(ana);
        }catch(Exception e){
            fail(e.getMessage());
        }
        
        
        
        try{
            sys.cadastrarInstrumento(x);
            sys.cadastrarCliente(aug);
            sys.cadastrarFuncionario(ana);
            fail("Erro");
        }catch(Exception e){
            
        }
        
        try{
            sys.realizarVenda(x.getNumeroSerie());
            assertEquals(sys.getGerenciadorDeFinancas().getDinheiroEmCaixa(), x.getValor(), 0.001);
            sys.cadastrarInstrumento(x);
        }catch (InstrumentoInexistenteException e){
            fail(e.getMessage());
        } catch (InstrumentoJaExisteException e) {
            fail(e.getMessage());
        }
        
        try{
            sys.efetuarPagamento(200);
        }catch(QuantiaInvalidaException e){
            fail(e.getMessage());
        }
        try{
            sys.efetuarPagamento(-200);
            fail("Pagamento de número inválido");
        }catch(QuantiaInvalidaException e){
            
        }
        
        try{
            sys.removerCliente(aug.getEmail());
            sys.removerFuncionario(ana.getId());
            sys.removerInstrumento(x.getNumeroSerie());
        }catch(Exception e){
            fail(e.getMessage());
        }
        
    }
    
}
