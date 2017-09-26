
package Classes;

import java.io.Serializable;

/**
 *
 * @author gmnun
 */
public class Pessoa implements Serializable{
    private String nome;
    private String cpf;
    private String rg;
    private String genero;
    private String email;
    private Telefone telefone;
    private Endereco endereco;
    private String dataNascimento;

    public Pessoa() {
        this("","","","","",new Telefone(), new Endereco(), "");
    }

    public Pessoa(String nome, String cpf, String rg, String genero, String email, Telefone telefone, Endereco endereco, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    
    
}
