package Classes;

import Exceptions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gmnun
 */
public class SistemaLojaMusical implements Serializable {

    private GerenciadorDeEstoque gerenciadorDeEstoque;
    private GerenciadorDeFinancas gerenciadorDeFinancas;
    private GerenciadorDePessoas gerenciadorDePessoas;
    private GerenciarArquivos gerenciarArquivos;

    public SistemaLojaMusical() {
        this(new GerenciadorDeEstoque(), new GerenciadorDeFinancas(), new GerenciadorDePessoas());
    }

    public SistemaLojaMusical(GerenciadorDeEstoque gerenciadorDeEstoque, GerenciadorDeFinancas gerenciadorDeFinancas, GerenciadorDePessoas gerenciadorDePessoas) {
        this.gerenciadorDeEstoque = gerenciadorDeEstoque;
        this.gerenciadorDeFinancas = gerenciadorDeFinancas;
        this.gerenciadorDePessoas = gerenciadorDePessoas;
        this.gerenciarArquivos = new GerenciarArquivos();
    }

    public GerenciadorDeEstoque getGerenciadorDeEstoque() {
        return gerenciadorDeEstoque;
    }

    public GerenciadorDeFinancas getGerenciadorDeFinancas() {
        return gerenciadorDeFinancas;
    }

    public GerenciadorDePessoas getGerenciadorDePessoas() {
        return gerenciadorDePessoas;
    }

    public void setGerenciadorDeEstoque(GerenciadorDeEstoque gerenciadorDeEstoque) {
        this.gerenciadorDeEstoque = gerenciadorDeEstoque;
    }
    public void setGerenciadorDeFinancas(GerenciadorDeFinancas gerenciadorDeFinancas) {
        this.gerenciadorDeFinancas = gerenciadorDeFinancas;
    }
    public void setGerenciadorDePessoas(GerenciadorDePessoas gerenciadorDePessoas) {
        this.gerenciadorDePessoas = gerenciadorDePessoas;
    }
    
    

    // Gerenciador de Pessoas
    /**
     *
     * Irá tentar cadastrar um cliente no gerenciador de pessoas.
     *
     * @param cliente
     * @throws ClienteJaExistenteException
     */
    public void cadastrarCliente(Cliente cliente) throws ClienteJaExistenteException {
        this.gerenciadorDePessoas.cadastrarCliente(cliente);
    }

    /**
     *
     * @param i
     * @throws FuncionarioJaExisteException
     */
    public void cadastrarFuncionario(Funcionario i) throws FuncionarioJaExisteException {
        this.gerenciadorDePessoas.cadastrarFuncionario(i);
    }

    /**
     *
     * @param email
     * @return
     * @throws ClienteInexistenteException
     */
    public Cliente buscarCliente(String email) throws ClienteInexistenteException {
        return this.gerenciadorDePessoas.buscarCliente(email);
    }

    /**
     *
     * @param id
     * @return
     * @throws FuncionarioInexistenteException
     */
    public Funcionario buscarFuncionario(String id) throws FuncionarioInexistenteException {
        return this.gerenciadorDePessoas.buscarFuncionario(id);
    }

    /**
     *
     * @param email
     * @throws ClienteInexistenteException
     */
    public void removerCliente(String email) throws ClienteInexistenteException {
        this.gerenciadorDePessoas.removerCliente(email);
    }

    /**
     *
     * @param id
     * @throws FuncionarioInexistenteException
     */
    public void removerFuncionario(String id) throws FuncionarioInexistenteException {
        this.gerenciadorDePessoas.removerFuncionario(id);
    }

    /**
     *
     * @return
     */
    public String[] nomesClientesToStringArray() {
        return this.gerenciadorDePessoas.nomeClientesToStringArray();
    }

    /**
     *
     * @return
     */
    public String[] nomesFuncionariosToStringArray() {
        return this.gerenciadorDePessoas.nomeFuncionariosToStringArray();
    }

    // Gerenciador de Finanças
    /**
     *
     * @param quantia
     * @throws QuantiaInvalidaException
     */
    public void efetuarRecebimento(double quantia) throws QuantiaInvalidaException {
        this.gerenciadorDeFinancas.efetuarRecebimento(quantia);
    }

    /**
     *
     * @param quantia
     * @throws QuantiaInvalidaException
     */
    public void efetuarPagamento(double quantia) throws QuantiaInvalidaException, PagamentoNaoAutorizadoException {
        this.gerenciadorDeFinancas.efetuarPagamento(quantia);
    }

    public double getDinheiroEmCaixa(){
        return this.gerenciadorDeFinancas.getDinheiroEmCaixa();
    }
    
    // Gerenciador de Estoque
    /**
     *
     * @param identificador
     * @return
     * @throws InstrumentoInexistenteException
     */
    public Instrumento buscarInstrumento(String identificador) throws InstrumentoInexistenteException {
        return this.gerenciadorDeEstoque.buscarInstrumento(identificador);
    }

    /**
     *
     * @param i
     * @throws InstrumentoJaExisteException
     */
    public void cadastrarInstrumento(Instrumento i) throws InstrumentoJaExisteException {
        this.gerenciadorDeEstoque.cadastrarInstrumento(i);
    }

    /**
     *
     * @param identificador
     * @throws InstrumentoInexistenteException
     */
    public void removerInstrumento(String identificador) throws InstrumentoInexistenteException {
        this.gerenciadorDeEstoque.removerInstrumento(identificador);
    }

    /**
     * Irá buscar um instrumento com código passado por parametro, efetuará o
     * recebimento da quantia do instrumento e então removerá o instrumento.
     *
     * @param identificador
     * @throws InstrumentoInexistenteException
     * @throws QuantiaInvalidaException
     * @throws QuantidadeInsuficienteException
     */
    public void realizarVenda(String identificador) throws InstrumentoInexistenteException, QuantiaInvalidaException, QuantidadeInsuficienteException{
        Instrumento x = this.buscarInstrumento(identificador);
        if(x.getQuantidade() <= 0){
            throw new QuantidadeInsuficienteException("Não há quantidade suficiente em estoque.");
        }
        this.efetuarRecebimento(x.getValor());
        x.setQuantidade(x.getQuantidade()-1);
    }
    
    
    // Gerenciar Arquivos

    public void salvar() throws IOException {
        gerenciarArquivos.salvar(gerenciadorDeEstoque, gerenciadorDeFinancas, gerenciadorDePessoas);
    }

    public void recuperar() throws IOException, FileNotFoundException, ClassNotFoundException {
        this.gerenciarArquivos.recuperar(this);
    }
}
