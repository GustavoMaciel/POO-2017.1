package Classes;

import Exceptions.ClienteJaExistenteException;
import Exceptions.FuncionarioJaExisteException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gustavo
 */
public class GerenciadorDePessoasTest {

    public GerenciadorDePessoasTest() {
    }
    
    @Test
    public void testRemoverCliente() throws Exception {
        GerenciadorDePessoas x = new GerenciadorDePessoas();
        Cliente i = new Cliente();
        i.setEmail("@");
        try {
            x.cadastrarCliente(i);
            x.removerCliente(i.getEmail());
        } catch (Exception e) {
            fail(e.getMessage());
        }
        
        try{
            x.removerCliente(i.getEmail());
            fail("Não deu erro ao remover.");
        }catch(Exception e){
            
        }
        try{
            x.cadastrarCliente(i);
            x.cadastrarCliente(i);
            fail("Cadastrou duas vezes.");
        }catch (ClienteJaExistenteException e){
        }

    }

    @Test
    public void testRemoverFuncionario() throws Exception {
        GerenciadorDePessoas x = new GerenciadorDePessoas();
        Funcionario i = new Funcionario();
        i.setId("0");
        try {
            x.cadastrarFuncionario(i);
            x.removerFuncionario(i.getId());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}
