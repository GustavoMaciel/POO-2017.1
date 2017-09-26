package Classes;

import java.io.Serializable;

/**
 *
 * @author gmnun
 */
public class SistemaLojaMusical implements Serializable{
    
    public GerenciadorDeEstoque gerenciadorDeEstoque;
    public GerenciadorDeFinancas gerenciadorDeFinancas;
    public GerenciadorDePessoas gerenciadorDePessoas;

    public SistemaLojaMusical() {
        this(new GerenciadorDeEstoque(), new GerenciadorDeFinancas(), new GerenciadorDePessoas());
    }
    
    public SistemaLojaMusical(GerenciadorDeEstoque gerenciadorDeEstoque, GerenciadorDeFinancas gerenciadorDeFinancas, GerenciadorDePessoas gerenciadorDePessoas) {
        this.gerenciadorDeEstoque = gerenciadorDeEstoque;
        this.gerenciadorDeFinancas = gerenciadorDeFinancas;
        this.gerenciadorDePessoas = gerenciadorDePessoas;
    }
    
}
