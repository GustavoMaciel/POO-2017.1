package SistemaMusical;

public interface Instrumento {
    public String getMarca();
    public String getNumeroSerie();
    public double getValor();
    public int getQtd();
    
    public void setMarca(String marca);
    public void setNumeroSerie(String numero);
    public void setValor(double valor);
    public void setQtd(int qtd);

    
}
