/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04.linhaferroviaria;

/**
 *
 * @author Afonso // uniriotec br
 */
public class Vagao extends Recurso {
    
    public int comprimentoTesteiras;
    public int comprimentoEngates;

    public Vagao(int comprimentoTesteiras, int comprimentoEngates) {
        super(comprimentoEngates + comprimentoTesteiras);
    }
    
    @Override
    public double comprimento(){
        return this.getComprimento();
    }
    
}
