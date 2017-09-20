
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
    
}
