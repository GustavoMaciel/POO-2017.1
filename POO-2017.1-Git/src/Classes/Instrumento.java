package Classes;

import java.io.Serializable;
import javax.swing.Icon;

public class Instrumento implements Serializable{
    private String marca, identificador, nome;
    private double valor;
    private Icon icon;

    public Instrumento() {
        this("","","", 0, null);
    }

    
    public Instrumento(String marca, String nome, String identificador, double valor, Icon icon) {
        this.marca = marca;
        this.nome = nome;
        this.identificador = identificador;
        this.valor = valor;
        this.icon = icon;
    }
    
    
    
    public String getMarca(){
        return marca;
    }
    public String getIdentificador(){
        return identificador;
    }
    public double getValor(){
        return valor;
    }
    public Icon getIcon() {
        return icon;
    }
    public String getNome() {
        return nome;
    }
    
        
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setIdentificador(String identificador){
        this.identificador = identificador;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public void setIcon(Icon icon) {
        this.icon = icon;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
