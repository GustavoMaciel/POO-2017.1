package Classes;

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
    
}
