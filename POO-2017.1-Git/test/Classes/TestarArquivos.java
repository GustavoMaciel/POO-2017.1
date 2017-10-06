package Classes;

import Exceptions.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gustavo
 */
public class TestarArquivos {

    @Test
    public void Testa() {
        SistemaLojaMusical sys = new SistemaLojaMusical();
        Cliente i = new Cliente("norm", false, "Gustavo", "027", "1282", "Masculino", "gus@", new Telefone("69", "9301"), new Endereco("Aristides", "Centro", "1447", "58297000", "PB", "Rio Tinto"), "25/04/1997");
        Funcionario x = new Funcionario("Adm", "0", 1200, "Gustavo", "027", "1282", "Masculino", "gus@", new Telefone("69", "9301"), new Endereco("Aristides", "Centro", "1447", "58297000", "PB", "Rio Tinto"), "25/04/1997");
        Instrumento ins = new Instrumento("Gibson", "027", "Guitarra", 120, null, 1);

        try {
            sys.cadastrarCliente(i);
            sys.cadastrarFuncionario(x);
            sys.cadastrarInstrumento(ins);
            sys.getGerenciadorDeFinancas().setDinheiroEmCaixa(1200);
        } catch (Exception e) {
            fail(e.getMessage());
        }
        int tamanhoAnt = sys.getGerenciadorDePessoas().getClientes().size();
        try {
            sys.salvar();
        } catch (IOException ex) {
            fail(ex.getMessage());
        }
        try {
            sys.removerCliente(i.getEmail());
            sys.removerFuncionario(x.getId());
            sys.removerInstrumento(ins.getIdentificador());
        } catch (Exception e) {
            fail(e.getMessage());
        }

        try {
            sys.recuperar();
        } catch (Exception e) {
            fail(e.getMessage());
        }
        assertEquals(sys.getGerenciadorDePessoas().getClientes().size(), tamanhoAnt);

        File f = new File("../POO-2017.1-Git/Saves/GerenciadorDePessoas.dat");
        f.delete();
        f = new File("../POO-2017.1-Git/Saves/GerenciadorDeEstoque.dat");
        f.delete();
        f = new File("../POO-2017.1-Git/Saves/GerenciadorDeFinancas.dat");
        f.delete();
    }
}
