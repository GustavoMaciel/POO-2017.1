package Classes;

import java.io.Serializable;

public class Instrumento implements Serializable{
    private String marca, numeroSerie, tipo;
    private double valor;

    public Instrumento() {
        this("","","", 0);
    }

    
    public Instrumento(String marca, String numeroSerie, String tipo, double valor) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.tipo = tipo;
        this.valor = valor;
    }
    
    
    
    public String getMarca(){
        return marca;
    }
    public String getNumeroSerie(){
        return numeroSerie;
    }
    public double getValor(){
        return valor;
    }
        
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setNumeroSerie(String numero){
        this.numeroSerie = numero;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
}
