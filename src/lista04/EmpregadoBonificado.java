/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04;

/**
 *
 * @author Afonso // uniriotec br
 */
public class EmpregadoBonificado extends Empregado {
    
    private double salarioBase;
    private double desconto;
    private double bonus;

    public EmpregadoBonificado(double salarioBase, double desconto, double bonus, String nome) {
        super(nome);
        this.salarioBase = salarioBase;
        this.desconto = desconto;
        this.bonus = bonus;
        super.setRegime("bonificado");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
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
        return (this.salarioBase * (1 - this.desconto)) * (1 + this.getBonus());
    }
}
