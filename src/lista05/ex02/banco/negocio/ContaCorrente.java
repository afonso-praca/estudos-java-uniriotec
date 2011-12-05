/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista05.ex02.banco.negocio;

/**
 *
 * @author LABCCET
 */
public class ContaCorrente {
    private static final int VALOR_LIMITE_PARA_DEBITO = 200000;

    private String numero;
    private int saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void debitar(int valor) throws BancoAppException {
        verificarPreCondicoesParaDebito(valor);

        saldo -= valor;
    }

    private void verificarPreCondicoesParaDebito(int valor) throws BancoAppException {
        verificarLimitesDebito(valor);
        verificarSaldo(valor);
    }

    private void verificarLimitesDebito(int valor) throws BancoAppException {
        if (valor <= 0) {
            throw new BancoAppException("Valor deve ser maior do que zero");
        }
        if (valor > VALOR_LIMITE_PARA_DEBITO) {
            throw new BancoAppException("Valor deve ser menor do que 2.000,00");
        }
    }

    private void verificarSaldo(int valor) throws BancoAppException {
        if (valor > saldo) {
            throw new BancoAppException("saldo insufucuente");
        }
    }

    public void creditar(int valor) {
        saldo += valor;
    }
}
