
package Classes;

/**
 *
 * @author gmnun
 */
public class Funcionario extends Pessoa{
    String tipo, id;
    double pagamento;

    public Funcionario() {
        this("", "", 0, "", "", "", "", "", new Telefone(), new Endereco(), "");
    }
    public Funcionario(String tipo, String id, double pagamento) {
        this.tipo = tipo;
        this.id = id;
        this.pagamento = pagamento;
    }

    public Funcionario(String tipo, String id, double pagamento, String nome, String cpf, String rg, String genero, String email, Telefone telefone, Endereco endereco, String dataNascimento) {
        super(nome, cpf, rg, genero, email, telefone, endereco, dataNascimento);
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

    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
