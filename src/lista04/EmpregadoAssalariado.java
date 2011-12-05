/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04;

/**
 *
 * @author Afonso // uniriotec br
 */
public class EmpregadoAssalariado extends Empregado {
    
    private double salarioBase;
    private double desconto;

    public EmpregadoAssalariado(double salarioBase, double desconto, String nome) {
        super(nome);
        this.salarioBase = salarioBase;
        this.desconto = desconto;
        super.setRegime("assalariado");
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    
    @Override
    public double valorLiquido() {
        return this.getSalarioBase() * (1 - this.getDesconto());
    }
    
}
