package Classes;

import Exceptions.*;

/**
 *
 * @author gmnun
 */
public class GerenciadorDeFinancas {

    private double dinheiroEmCaixa;

    public GerenciadorDeFinancas() {
        this(0);
    }

    public GerenciadorDeFinancas(double dinheiroEmCaixa) {
        this.dinheiroEmCaixa = dinheiroEmCaixa;
    }

    public double getDinheiroEmCaixa() {
        return dinheiroEmCaixa;
    }

    public void setDinheiroEmCaixa(double dinheiroEmCaixa) {
        this.dinheiroEmCaixa = dinheiroEmCaixa;
    }

    public void efetuarCompra(double quantia) throws QuantiaInvalidaException {
        if (quantia < 0) {
            throw new QuantiaInvalidaException("É inválida a quantia de: " + quantia);
        }
        this.dinheiroEmCaixa += quantia;
    }

    public void efetuarPagamento(double quantia) throws QuantiaInvalidaException {
        if (quantia < 0) {
            throw new QuantiaInvalidaException("É inválida a quantia de: " + quantia);
        }
        this.dinheiroEmCaixa -= quantia;
    }
    
}
