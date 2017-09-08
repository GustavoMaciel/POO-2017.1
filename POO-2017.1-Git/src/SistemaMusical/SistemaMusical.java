package SistemaMusical;

import Exceptions.QuantidadeInsuficienteException;
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
        if(this.instrumentos.get(ins.getNumeroSerie()) == null){
            this.instrumentos.put(ins.getNumeroSerie(), ins);
        }else{
            throw new InstrumentoJaExisteException("Já existe o instrumento: " + ins.getNumeroSerie());
        }
    }
    
    public void cadastrarFuncionario(Funcionario fun) throws FuncionarioJaExisteException{
        if(this.funcionarios.get(fun.getId()) == null){
            this.funcionarios.put(fun.getId(), fun);
        }else{
            throw new FuncionarioJaExisteException("Já existe o funcionário: " + fun.getId());
        }
    }
    
    public Instrumento removerInstrumento(Instrumento ins)throws InstrumentoInexistenteException{
        Instrumento x = this.buscarInstrumento(ins.getNumeroSerie());
        this.instrumentos.remove(x.getNumeroSerie());
        return x;
    }
    public Funcionario removerFuncionario(Funcionario fun) throws FuncionarioInexistenteException{
        Funcionario x = this.buscarFuncionario(fun.getId());
        this.funcionarios.remove(x.getId());
        return x;
    }
    
    public Funcionario buscarFuncionario(String id) throws FuncionarioInexistenteException{
        Funcionario x = this.funcionarios.get(id);
        if(x == null){
            throw new FuncionarioInexistenteException("Não há funcionário com ID: " + id);
        }
        return x;
    }
    public Instrumento buscarInstrumento(String serial) throws InstrumentoInexistenteException{
        Instrumento x = this.instrumentos.get(serial);
        if(x == null){
            throw new InstrumentoInexistenteException("Não há instrumento com número de série: " + serial);
        }
        return x;
    }
    
    public void comprarInstrumento(String serial, int qtd) throws InstrumentoInexistenteException, QuantidadeInsuficienteException{
        Instrumento x = this.buscarInstrumento(serial);
        if(x.getQtd()<=0 || x.getQtd() < qtd){
            throw new QuantidadeInsuficienteException("Não há instrumentos suficientes.");
        }
        x.setQtd(x.getQtd()-qtd);
        this.caixa += x.getValor();
    }
}