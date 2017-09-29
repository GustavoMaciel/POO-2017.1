package Classes;

import Exceptions.*;
import java.io.Serializable;

/**
 *
 * @author gmnun
 */
public class SistemaLojaMusical implements Serializable{
    
    private GerenciadorDeEstoque gerenciadorDeEstoque;
    private GerenciadorDeFinancas gerenciadorDeFinancas;
    private GerenciadorDePessoas gerenciadorDePessoas;

    public SistemaLojaMusical() {
        this(new GerenciadorDeEstoque(), new GerenciadorDeFinancas(), new GerenciadorDePessoas());
    }
    
    public SistemaLojaMusical(GerenciadorDeEstoque gerenciadorDeEstoque, GerenciadorDeFinancas gerenciadorDeFinancas, GerenciadorDePessoas gerenciadorDePessoas) {
        this.gerenciadorDeEstoque = gerenciadorDeEstoque;
        this.gerenciadorDeFinancas = gerenciadorDeFinancas;
        this.gerenciadorDePessoas = gerenciadorDePessoas;
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
    
    
    // Gerenciador de Pessoas

    /**
     *
     * Irá tentar cadastrar um cliente no gerenciador de pessoas.
     * @param cliente
     * @throws ClienteJaExistenteException
     */    
    public void cadastrarCliente(Cliente cliente) throws ClienteJaExistenteException{
        this.gerenciadorDePessoas.cadastrarCliente(cliente);
    }

    /**
     *
     * @param i
     * @throws FuncionarioJaExisteException
     */
    public void cadastrarFuncionario(Funcionario i) throws FuncionarioJaExisteException{
        this.gerenciadorDePessoas.cadastrarFuncionario(i);
    }

    /**
     *
     * @param email
     * @return
     * @throws ClienteInexistenteException
     */
    public Cliente buscarCliente(String email) throws ClienteInexistenteException{
        return this.gerenciadorDePessoas.buscarCliente(email);
    }

    /**
     *
     * @param id
     * @return
     * @throws FuncionarioInexistenteException
     */
    public Funcionario buscarFuncionario(String id) throws FuncionarioInexistenteException{
        return this.gerenciadorDePessoas.buscarFuncionario(id);
    }

    /**
     *
     * @param email
     * @throws ClienteInexistenteException
     */
    public void removerCliente(String email) throws ClienteInexistenteException{
        this.gerenciadorDePessoas.removerCliente(email);
    }

    /**
     *
     * @param id
     * @throws FuncionarioInexistenteException
     */
    public void removerFuncionario(String id) throws FuncionarioInexistenteException{
        this.gerenciadorDePessoas.removerFuncionario(id);
    }

    /**
     *
     * @return
     */
    public String[] nomesClientesToStringArray(){
        return this.gerenciadorDePessoas.nomeClientesToStringArray();
    }

    /**
     *
     * @return
     */
    public String[] nomesFuncionariosToStringArray(){
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
    
    // Gerenciador de Estoque

    /**
     *
     * @param numSerie
     * @return
     * @throws InstrumentoInexistenteException
     */
    public Instrumento buscarInstrumento(String numSerie) throws InstrumentoInexistenteException{
        return this.gerenciadorDeEstoque.buscarInstrumento(numSerie);
    }

    /**
     *
     * @param i
     * @throws InstrumentoJaExisteException
     */
    public void cadastrarInstrumento(Instrumento i) throws InstrumentoJaExisteException{
        this.gerenciadorDeEstoque.cadastrarInstrumento(i);
    }

    /**
     *
     * @param numSerie
     * @throws InstrumentoInexistenteException
     */
    public void removerInstrumento(String numSerie) throws InstrumentoInexistenteException{
        this.gerenciadorDeEstoque.removerInstrumento(numSerie);
    }
    
    /**
     *
     * @param numSerie
     * @throws InstrumentoInexistenteException
     * @throws QuantiaInvalidaException
     */
    public void realizarVenda(String numSerie) throws InstrumentoInexistenteException, QuantiaInvalidaException{
        Instrumento x = this.buscarInstrumento(numSerie);
        this.efetuarRecebimento(x.getValor());
        this.removerInstrumento(numSerie);
    }
    
}
