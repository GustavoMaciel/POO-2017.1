
package Classes;

/**
 *
 * @author gmnun
 */
public class Cliente extends Pessoa{
    String tipo;
    boolean statusDevedor;

    public Cliente() {
        this("", false);
    }
    public Cliente(String tipo, boolean statusDevedor) {
        this.tipo = tipo;
        this.statusDevedor = statusDevedor;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isStatusDevedor() {
        return statusDevedor;
    }

    public void setStatusDevedor(boolean statusDevedor) {
        this.statusDevedor = statusDevedor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
