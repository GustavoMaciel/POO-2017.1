package Classes;

public class Instrumento {
    private String marca, numeroSerie;
    private double valor;
    
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
