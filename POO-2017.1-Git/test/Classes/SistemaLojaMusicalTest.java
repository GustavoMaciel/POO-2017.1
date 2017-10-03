package Classes;

import Exceptions.*;
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

        try {
            sys.cadastrarInstrumento(x);
            sys.cadastrarCliente(aug);
            sys.cadastrarFuncionario(ana);
        } catch (Exception e) {
            fail(e.getMessage());
        }

        try {
            sys.cadastrarInstrumento(x);
            sys.cadastrarCliente(aug);
            sys.cadastrarFuncionario(ana);
            fail("Repetiu cadastramento");
        } catch (Exception e) {

        }

        try {
            sys.realizarVenda(x.getNumeroSerie());
            assertEquals(sys.getGerenciadorDeFinancas().getDinheiroEmCaixa(), x.getValor(), 0.001);
            sys.cadastrarInstrumento(x);
        } catch (InstrumentoInexistenteException | InstrumentoJaExisteException e) {
            fail(e.getMessage());
        }

        try {
            sys.efetuarPagamento(200);
        } catch (QuantiaInvalidaException | PagamentoNaoAutorizadoException e) {
            fail(e.getMessage());
        }
        try {
            sys.efetuarPagamento(-200);
            fail("Pagamento de número inválido");
        } catch (QuantiaInvalidaException e) {

        } catch (PagamentoNaoAutorizadoException e) {

        }
        try {
            sys.efetuarPagamento(15000);
            fail("Pagamento sem ter dinheiro em caixa.");
        } catch (QuantiaInvalidaException | PagamentoNaoAutorizadoException ex) {
        }

        try {
            sys.removerCliente(aug.getEmail());
            sys.removerFuncionario(ana.getId());
            sys.removerInstrumento(x.getNumeroSerie());
        } catch (Exception e) {
            fail(e.getMessage());
        }

    }

}
