package Classes;

/**
 *
 * @author gmnun
 */
public class SistemaLojaMusical {
    public static GerenciadorDeEstoque gerenciadorDeEstoque;
    public static GerenciadorDeFinancas gerenciadorDeFinancas;
    public static GerenciadorDePessoas gerenciadorDePessoas;

    public SistemaLojaMusical() {
        this(new GerenciadorDeEstoque(), new GerenciadorDeFinancas(), new GerenciadorDePessoas());
    }
    
    public SistemaLojaMusical(GerenciadorDeEstoque gerenciadorDeEstoque, GerenciadorDeFinancas gerenciadorDeFinancas, GerenciadorDePessoas gerenciadorDePessoas) {
        SistemaLojaMusical.gerenciadorDeEstoque = gerenciadorDeEstoque;
        SistemaLojaMusical.gerenciadorDeFinancas = gerenciadorDeFinancas;
        SistemaLojaMusical.gerenciadorDePessoas = gerenciadorDePessoas;
    }
    
}
