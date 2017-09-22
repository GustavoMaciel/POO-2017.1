
package Classes;

/**
 *
 * @author gmnun
 */
public class Cliente extends Pessoa{
    String tipo;
    boolean statusDevedor;

    public Cliente() {
        this("", false, "","","","","", new Telefone(), new Endereco(), new Data());
    }
    public Cliente(String tipo, boolean statusDevedor) {
        this.tipo = tipo;
        this.statusDevedor = statusDevedor;
    }

    public Cliente(String tipo, boolean statusDevedor, String nome, String cpf, String rg, String genero, String email, Telefone telefone, Endereco endereco, Data dataNascimento) {
        super(nome, cpf, rg, genero, email, telefone, endereco, dataNascimento);
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

    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
