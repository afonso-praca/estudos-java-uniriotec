/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04.linhaferroviaria;

/**
 *
 * @author Afonso // uniriotec br
 */
public class Trem extends Recurso {
    
    public Recurso[] recursosDoTrem;

    public Trem(Recurso[] recursosDoTrem) {
        this.recursosDoTrem = recursosDoTrem;
    }
    
    @Override
    public double comprimento() {
        
        double comprimentoTotal = 0;
        
        for (int i = 0; i < recursosDoTrem.length; i++) {
            Recurso recurso = recursosDoTrem[i];
            comprimentoTotal+=recurso.comprimento();
        }
        
        return (comprimentoTotal);
    }
}
