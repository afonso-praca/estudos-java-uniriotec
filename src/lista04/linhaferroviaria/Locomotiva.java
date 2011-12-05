/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04.linhaferroviaria;

/**
 *
 * @author Afonso // uniriotec br
 */
public class Locomotiva extends Recurso {
    
    public Locomotiva(int comprimento) {
        super(comprimento);
    }
    
    @Override
    public double comprimento(){
        return this.getComprimento();
    }
}
