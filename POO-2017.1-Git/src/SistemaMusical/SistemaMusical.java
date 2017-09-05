package SistemaMusical;

import Exceptions.FuncionarioJaExisteException;
import Exceptions.InstrumentoJaExisteException;
import java.util.HashMap;
import java.util.Map;
import Exceptions.*;

public class SistemaMusical {
    private Map<String, Funcionario> funcionarios;
    private Map<String, Instrumento> instrumentos;
    private double caixa;
    
    public SistemaMusical(){
        this(new HashMap<String, Funcionario>(), new HashMap<String, Instrumento>(), 0);
    }
    public SistemaMusical(Map<String, Funcionario> funcionarios, Map<String, Instrumento> instrumentos, double caixa){
        this.funcionarios = funcionarios;
        this.instrumentos = instrumentos;
        this.caixa = caixa;
    }

    public double getCaixa() {
        return caixa;
    }
    public Map<String, Funcionario> getFuncionarios() {
        return funcionarios;
    }
    public Map<String, Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void setCaixa(double caixa) {
        this.caixa = caixa;
    }
    public void setFuncionarios(Map<String, Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    public void setInstrumentos(Map<String, Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }
    
    public void cadastrarInstrumento(Instrumento ins) throws InstrumentoJaExisteException{
        
    }
    public void cadastrarFuncionario(Funcionario fun) throws FuncionarioJaExisteException{
        
    }
    
    public Instrumento removerInstrumento(Instrumento ins)throws InstrumentoInexistenteException{
        return null;
    }
    public Funcionario removerFuncionario(Funcionario fun) throws FuncionarioInexistenteException{
        return null;
    }
    
    public Funcionario buscarFuncionario(String id) throws FuncionarioInexistenteException{
        return null;
    }
    public Instrumento buscarInstrumento(String serial) throws InstrumentoInexistenteException{
        return null;
    }
    
    public void comprarInstrumento(String serial) throws InstrumentoInexistenteException {
        
    }
}