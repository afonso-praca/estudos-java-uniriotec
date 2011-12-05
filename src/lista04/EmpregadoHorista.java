/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04;

/**
 *
 * @author Afonso // uniriotec br
 */
public class EmpregadoHorista extends Empregado {
    
    private double numHoras;
    private double valorHora;
    private final double taxaFixa = 200;

    public EmpregadoHorista(double numHoras, double valorHora, String nome) {
        super(nome);
        this.numHoras = numHoras;
        this.valorHora = valorHora;
        super.setRegime("horista");
    }

    public double getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(double numHoras) {
        this.numHoras = numHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    @Override
    public double valorLiquido() {
        return (this.numHoras * this.valorHora) - taxaFixa;
    }
}
