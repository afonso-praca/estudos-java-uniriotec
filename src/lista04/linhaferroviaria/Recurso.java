/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04.linhaferroviaria;

/**
 *
 * @author Afonso // uniriotec br
 */
public abstract class Recurso {
    
    private int comprimento;

    public Recurso() {
    }

    public Recurso(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    
    public abstract double comprimento();
}
