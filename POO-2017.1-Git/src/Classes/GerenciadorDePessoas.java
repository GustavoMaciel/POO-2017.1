package Classes;

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
    
    
}
