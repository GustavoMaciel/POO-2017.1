
package Classes;

/**
 *
 * @author gmnun
 */
public class Funcionario extends Pessoa{
    String tipo, id;
    double pagamento;

    public Funcionario() {
        this("", "", 0);
    }
    public Funcionario(String tipo, String id, double pagamento) {
        this.tipo = tipo;
        this.id = id;
        this.pagamento = pagamento;
    }
    
    
}
