package Classes;

import Exceptions.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gmnun
 */
public class GerenciadorDeEstoque implements Serializable{
    private Map<String, Instrumento> instrumentos;

    public GerenciadorDeEstoque() {
        this(new HashMap<String, Instrumento>());
    }

    public GerenciadorDeEstoque(Map<String, Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }

    public Map<String, Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(Map<String, Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }

    public Instrumento buscarInstrumento(String identificador) throws InstrumentoInexistenteException{
        Instrumento x = this.instrumentos.get(identificador);
        if(x == null){
            throw new InstrumentoInexistenteException("Não existe instrumento com identificador: " + identificador);
        }
        return x;
    }

    public void cadastrarInstrumento(Instrumento i) throws InstrumentoJaExisteException{
        try{
            this.buscarInstrumento(i.getIdentificador());
            throw new InstrumentoJaExisteException("Já existe instrumento com Identificador: " + i.getIdentificador());
        }catch(InstrumentoInexistenteException e){
            this.instrumentos.put(i.getIdentificador(), i);
        }
    }

    public void removerInstrumento(String identificador) throws InstrumentoInexistenteException{
        this.buscarInstrumento(identificador);
        this.instrumentos.remove(identificador);
    }
}