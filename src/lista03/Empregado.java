/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03;

/**
 *
 * @author Afonso
 */
public class Empregado {
    
    private String nome;
    private int salario;
    private double desconto;
    private int altura;
    
    private static int numEmpregados = 0;
    
     public Empregado() {
         numEmpregados++;
     }

    public Empregado(String nome, int salario, double desconto, int altura) {
        this.nome = nome;
        this.salario = salario;
        this.desconto = desconto;
        this.altura = altura;
        
        numEmpregados++;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public static int getNumEmpregados() {
        return numEmpregados;
    }
    
    public double getSalarioComDesconto() {
        return (this.salario - (this.salario * desconto));
    }
    
}
