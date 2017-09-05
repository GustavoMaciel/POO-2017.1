package SistemaMusical;

public class Funcionario {
	private String nome;
	private String email;
	private String id;
	private double pagamento;

	public Funcionario() {
		this.nome = "";
		this.email = "";
		this.id = "";
		this.pagamento = 0;

	}

	public Funcionario(String nome, String email, String id, double pagamento) {
		this.nome = nome;
		this.email = email;
		this.id = id;
		this.pagamento = pagamento;

	}

	public String getNome() {
		return this.nome;
	}

	public String getEmail() {
		return this.email;
	}

	public double getId() {
		return this.id;
	}

	public int getPagamento() {
		return this.pagamento;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setID(double id) {
		this.id = id;
	}

	public void setPagamento(double pagamento) {
		this.pagamento = pagamento;
	}

	@override
	public String toString() {
		return "Nome: " + this.nome + ", Email: " + this.email + ", Id: " + this.id
				+ ", pagamento: " + this.pagamento;
	}
}
