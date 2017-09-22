
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

    public String getId() {
        return id;
    }

    public double getPagamento() {
        return pagamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPagamento(double pagamento) {
        this.pagamento = pagamento;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
