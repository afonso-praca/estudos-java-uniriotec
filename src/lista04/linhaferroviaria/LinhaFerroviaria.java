/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04.linhaferroviaria;

/**
 *
 * @author Afonso // uniriotec br
 */
public class LinhaFerroviaria {
    
    private Recurso[] recursosEstacionados;

    public LinhaFerroviaria(Recurso[] recursosEstacionados) {
        this.recursosEstacionados = recursosEstacionados;
    }
    
    public double getOcupacao() {
        
        double ocupacao = 0;
        
        for (int i = 0; i < recursosEstacionados.length; i++) {
            Recurso recurso = recursosEstacionados[i];
            ocupacao+=recurso.comprimento();
        }
        
        return ocupacao;
    }
}
