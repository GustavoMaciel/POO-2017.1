package Classes;

import Exceptions.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gmnun
 */
public class GerenciadorDePessoas implements Serializable{
    private Map<String, Funcionario> funcionarios;
    private Map<String, Cliente> clientes;

    public GerenciadorDePessoas() {
        this(new HashMap<String, Funcionario>(), new HashMap<String, Cliente>());
    }

    public GerenciadorDePessoas(Map<String, Funcionario> funcionarios, Map<String, Cliente> clientes) {
        this.funcionarios = funcionarios;
        this.clientes = clientes;
    }

    public Map<String, Cliente> getClientes() {
        return clientes;
    }

    public Map<String, Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setClientes(Map<String, Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setFuncionarios(Map<String, Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    public Cliente buscarCliente(String email) throws ClienteInexistenteException{
        Cliente i = this.clientes.get(email);
        if(i == null){
            throw new ClienteInexistenteException("Não há cliente com e-mail: " + email);
        }
        return i;
    }
    
    public Funcionario buscarFuncionario(String id) throws FuncionarioInexistenteException{
        Funcionario i = this.funcionarios.get(id);
        if(i == null){
            throw new FuncionarioInexistenteException("Não há funcionário com ID: " + id);
        }
        return i;
    }
    
    public void cadastrarCliente(Cliente i) throws ClienteJaExistenteException{
        try{
            this.buscarCliente(i.getEmail());
            throw new ClienteJaExistenteException("Já existe cliente com o e-mail: " + i.getEmail());
        }catch (ClienteInexistenteException e){
            this.clientes.put(i.getEmail(), i);
        }
    }
    
    public void cadastrarFuncionario(Funcionario i) throws FuncionarioJaExisteException{
        try{
            this.buscarFuncionario(i.getId());
            throw new FuncionarioJaExisteException("Já existe funcionário com o ID: " + i.getId());
        }catch (FuncionarioInexistenteException e){
            this.funcionarios.put(i.getId(), i);
        }
    }
    
    public void removerCliente(String email) throws ClienteInexistenteException{
        this.buscarCliente(email);
        this.clientes.remove(email);
    }
    public void removerFuncionario(String id) throws FuncionarioInexistenteException{
        this.buscarFuncionario(id);
        this.funcionarios.remove(id);
    }
    
    public String[] nomeClientesToStringArray(){
        String[] nomes = new String[this.clientes.size()];
        int x = 0;
        for(Cliente i: this.clientes.values()){
            nomes[x] = i.getNome();
        }
        return nomes;
    }
    
    public String[] nomeFuncionariosToStringArray(){
        String[] nomes = new String[this.funcionarios.size()];
        int x = 0;
        for(Funcionario i: this.funcionarios.values()){
            nomes[x] = i.getNome();
        }
        return nomes;
    }
}
