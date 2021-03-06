package Classes;

import Exceptions.*;
import java.io.Serializable;

/**
 *
 * @author gmnun
 */
public class GerenciadorDeFinancas implements Serializable{

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

    public void efetuarRecebimento(double quantia) throws QuantiaInvalidaException {
        if (quantia < 0) {
            throw new QuantiaInvalidaException("É inválida a quantia de: " + quantia);
        }
        this.dinheiroEmCaixa += quantia;
    }

    public void efetuarPagamento(double quantia) throws QuantiaInvalidaException, PagamentoNaoAutorizadoException{
        if (quantia < 0) {
            throw new QuantiaInvalidaException("É inválida a quantia de: " + quantia);
        }
        if(quantia > this.dinheiroEmCaixa){
            throw new PagamentoNaoAutorizadoException("Pagamento não autorizado por falta de dinheiro em caixa.");
        }
        this.dinheiroEmCaixa -= quantia;
    }
    
}
