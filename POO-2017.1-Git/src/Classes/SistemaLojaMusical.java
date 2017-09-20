package Classes;

/**
 *
 * @author gmnun
 */
public class SistemaLojaMusical {
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
        
}
