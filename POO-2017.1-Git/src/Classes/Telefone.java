package Classes;

import java.io.Serializable;

/**
 *
 * @author gmnun
 */
public class Telefone implements Serializable{
    private String  ddd, numero;
    
    public Telefone(){
        this("","");
    }
    public Telefone(String ddd, String numero){
        this.ddd = ddd;
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }
    public String getNumero() {
        return numero;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }
    public void setNumero(String numero) {
        this.numero = numero;
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
