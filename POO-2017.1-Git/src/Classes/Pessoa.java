
package Classes;

/**
 *
 * @author gmnun
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private String rg;
    private String genero;
    private String email;
    private Telefone telefone;
    private Endereco endereco;
    private Data dataNascimento;

    public Pessoa() {
        this("","","","","",new Telefone(), new Endereco(), new Data());
    }

    public Pessoa(String nome, String cpf, String rg, String genero, String email, Telefone telefone, Endereco endereco, Data dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }
    
    
}
