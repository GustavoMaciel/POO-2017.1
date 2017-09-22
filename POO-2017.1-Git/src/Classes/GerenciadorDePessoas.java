package Classes;

import Exceptions.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gmnun
 */
public class GerenciadorDePessoas {
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
        
    }
    
    public void cadastrarFuncionario(Funcionario i) throws FuncionarioJaExisteException{
        
    }
    
    public void removerCliente(String email) throws ClienteInexistenteException{
        
    }
    public void removerFuncionario(String id) throws FuncionarioInexistenteException{
        
    }
}
