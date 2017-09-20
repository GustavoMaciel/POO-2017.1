package Classes;

/**
 *
 * @author gmnun
 */
public class Endereco {
    private String logradouro, bairro, numero, cep, estado, cidade;

    public Endereco(){
        this("","","","","");
    }
    public Endereco(String logradouro, String bairro, String numero, String cep, String estado) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.numero = numero;
        this.cep = cep;
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }
    public String getBairro() {
        return bairro;
    }
    public String getCep() {
        return cep;
    }
    public String getEstado() {
        return estado;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public String getNumero() {
        return numero;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return logradouro + ", " + numero + ", " + bairro +", " + cep + ", " + cidade + " - " + estado ;
    }
    
    
}
