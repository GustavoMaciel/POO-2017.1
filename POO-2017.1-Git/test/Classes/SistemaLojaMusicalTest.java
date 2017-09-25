package Classes;

import Exceptions.InstrumentoInexistenteException;
import Exceptions.InstrumentoJaExisteException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            sys.gerenciadorDeEstoque.cadastrarInstrumento(x);
            sys.gerenciadorDePessoas.cadastrarCliente(aug);
            sys.gerenciadorDePessoas.cadastrarFuncionario(ana);
        }catch(Exception e){
            fail(e.getMessage());
        }
        
        try{
            sys.gerenciadorDeEstoque.cadastrarInstrumento(x);
            sys.gerenciadorDePessoas.cadastrarCliente(aug);
            sys.gerenciadorDePessoas.cadastrarFuncionario(ana);
            fail("Erro");
        }catch(Exception e){
            
        }
        
        try{
            sys.gerenciadorDeEstoque.realizarVenda(sys, x.getNumeroSerie());
            assertEquals(sys.gerenciadorDeFinancas.getDinheiroEmCaixa(), x.getValor(), 0.001);
            sys.gerenciadorDeEstoque.cadastrarInstrumento(x);
        }catch (InstrumentoInexistenteException e){
            fail(e.getMessage());
        } catch (InstrumentoJaExisteException e) {
            fail(e.getMessage());
        }
        
        try{
            sys.gerenciadorDePessoas.removerCliente(aug.getEmail());
            sys.gerenciadorDePessoas.removerFuncionario(ana.getId());
            sys.gerenciadorDeEstoque.removerInstrumento(x.getNumeroSerie());
        }catch(Exception e){
            fail(e.getMessage());
        }
        
    }
    
}
