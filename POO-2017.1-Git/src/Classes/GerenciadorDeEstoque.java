package Classes;

import Exceptions.InstrumentoInexistenteException;
import Exceptions.InstrumentoJaExisteException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author gmnun
 */
public class GerenciadorDeEstoque {
    Map<String, Instrumento> instrumentos;

    public GerenciadorDeEstoque() {
        this(new HashMap<String, Instrumento>());
    }

    public GerenciadorDeEstoque(Map<String, Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }
    
    public Instrumento buscarInstrumento(String numSerie) throws InstrumentoInexistenteException{
        Instrumento x = this.instrumentos.get(numSerie);
        if(x == null){
            throw new InstrumentoInexistenteException("Não existe instrumento com Nº de série: " + numSerie);
        }
        return x;
    }
    
    public void cadastrarInstrumento(Instrumento i) throws InstrumentoJaExisteException{
        if(this.instrumentos.get(i.getNumeroSerie()) != null){
            throw new InstrumentoJaExisteException("Já cadastrado instrumento com Nº de série: " + i.getNumeroSerie());
        }
        this.instrumentos.put(i.getNumeroSerie(), i);
    }
    
    public void removerInstrumento(Instrumento i) throws InstrumentoInexistenteException{
        if(this.instrumentos.get(i.getNumeroSerie()) == null){
            throw new InstrumentoInexistenteException("Não existe instrumento com Nº de série: " + i.getNumeroSerie());
        }
        this.instrumentos.remove(i.getNumeroSerie());
    }
    
    
}
