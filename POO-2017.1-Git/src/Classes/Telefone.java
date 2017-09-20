package Classes;

/**
 *
 * @author gmnun
 */
public class Telefone {
    private String operadora, ddd, numero;
    
    public Telefone(){
        this("","","");
    }
    public Telefone(String operadora, String ddd, String numero){
        this.operadora = operadora;
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }
    public String getNumero() {
        return numero;
    }
    public String getOperadora() {
        return operadora;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "(" + ddd + ")" + " " + numero;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
