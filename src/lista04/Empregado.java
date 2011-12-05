/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04;

/**
 *
 * @author Afonso // uniriotec br
 */
public abstract class Empregado{
    
    private String nome;
    private String regime;
    private static int numerodeEmpregados;
    
    public Empregado(){
        
    }

    public Empregado(String nome) {
        this.nome = nome;
        numerodeEmpregados++;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract double valorLiquido();
    
}
