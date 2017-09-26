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
    public void cadastrarCliente(Cliente i) throws ClienteJaExistenteException{
        this.gerenciadorDePessoas.cadastrarCliente(i);
    }
    public void cadastrarFuncionario(Funcionario i) throws FuncionarioJaExisteException{
        this.gerenciadorDePessoas.cadastrarFuncionario(i);
    }
    public Cliente buscarCliente(String email) throws ClienteInexistenteException{
        return this.gerenciadorDePessoas.buscarCliente(email);
    }
    public Funcionario buscarFuncionario(String id) throws FuncionarioInexistenteException{
        return this.gerenciadorDePessoas.buscarFuncionario(id);
    }
    public void removerCliente(String email) throws ClienteInexistenteException{
        this.gerenciadorDePessoas.removerCliente(email);
    }
    public void removerFuncionario(String id) throws FuncionarioInexistenteException{
        this.gerenciadorDePessoas.removerFuncionario(id);
    }
    public String[] nomesClientesToStringArray(){
        return this.gerenciadorDePessoas.nomeClientesToStringArray();
    }
    public String[] nomesFuncionariosToStringArray(){
        return this.gerenciadorDePessoas.nomeFuncionariosToStringArray();
    }
    
    // Gerenciador de Finanças
    public void efetuarRecebimento(double quantia) throws QuantiaInvalidaException {
        this.gerenciadorDeFinancas.efetuarRecebimento(quantia);
    }
    public void efetuarPagamento(double quantia) throws QuantiaInvalidaException {
        this.gerenciadorDeFinancas.efetuarPagamento(quantia);
    }
    
    // Gerenciador de Estoque
    public Instrumento buscarInstrumento(String numSerie) throws InstrumentoInexistenteException{
        return this.gerenciadorDeEstoque.buscarInstrumento(numSerie);
    }
    public void cadastrarInstrumento(Instrumento i) throws InstrumentoJaExisteException{
        this.gerenciadorDeEstoque.cadastrarInstrumento(i);
    }
    public void removerInstrumento(String numSerie) throws InstrumentoInexistenteException{
        this.gerenciadorDeEstoque.removerInstrumento(numSerie);
    }
    public void realizarVenda(String numSerie) throws InstrumentoInexistenteException, QuantiaInvalidaException{
        this.gerenciadorDeEstoque.realizarVenda(this.gerenciadorDeFinancas, numSerie);
    }
    
}
