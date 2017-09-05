package SistemaMusical;

public class Bateria implements Instrumento {
	private String marca;
	private String numeroSerie;
	private double valor;
	private int quantidade;

	public Bateria() {
		this.marca = "";
		this.numeroSerie = "";
		this.valor = 0;
		this.quantidade = 0;
	}

	public Bateria(String marca, String serie, double valor, int qtd) {
		this.marca = marca;
		this.numeroSerie = serie;
		this.valor = valor;
		this.quantidade = qtd;
	}

	@Override
	public String getMarca() {
		return this.marca;
	}

	@Override
	public String getNumeroSerie() {
		return this.numeroSerie;
	}

	@Override
	public double getValor() {
		return this.valor;
	}

	@Override
	public int getQtd() {
		return this.quantidade;
	}

	@Override
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public void setNumeroSerie(String numero) {
		this.numeroSerie = numero;
	}

	@Override
	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public void setQtd(int qtd) {
		this.quantidade = qtd;
	}

	@Override
	public String toString() {
		return "marca: " + this.marca + ", numero de série: " + this.numeroSerie + ", valor: " + this.valor
				+ ", quantidade disponível: " + this.quantidade;
	}

}
