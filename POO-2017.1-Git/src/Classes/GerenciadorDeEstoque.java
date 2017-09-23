package Classes;

import Exceptions.*;
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
        try{
            this.buscarInstrumento(i.getNumeroSerie());
            throw new InstrumentoJaExisteException("Já existe instrumento com Nº de série: " + i.getNumeroSerie());
        }catch(InstrumentoInexistenteException e){
            this.instrumentos.put(i.getNumeroSerie(), i);
        }
    }

    public void removerInstrumento(String numSerie) throws InstrumentoInexistenteException{
        this.buscarInstrumento(numSerie);
        this.instrumentos.remove(numSerie);
    }
    
    public void realizarVenda(SistemaLojaMusical sys, String num) throws InstrumentoInexistenteException, QuantiaInvalidaException{
        Instrumento x = this.buscarInstrumento(num);
        sys.gerenciadorDeFinancas.efetuarRecebimento(0);
        this.removerInstrumento(num);
    }

}