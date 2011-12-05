/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04.linhaferroviaria;

/**
 *
 * @author Afonso // uniriotec br
 */
public class ex7 {
    
    public static void main(String[] args) {
        
        LinhaFerroviaria linha;
        
        Recurso[] recursosEstacionados = new Recurso[4]; // recursos estacionados na linha
        Recurso[] recursosTrem1 = new Recurso[3]; // recursos do trem 1
        
        //criacao do trem 1
        recursosTrem1[0] = new Locomotiva(10);
        recursosTrem1[1] = new Vagao(10, 2);
        recursosTrem1[2] = new Vagao(10, 2);
       
        Trem trem1 = new Trem(recursosTrem1);
        
        //povoando os recursos da linha
        recursosEstacionados[0] = new Locomotiva(20);
        recursosEstacionados[1]= new Locomotiva(50);
        recursosEstacionados[2]= new Vagao(10, 2);
        recursosEstacionados[3]= new Trem(recursosTrem1);
        
        //incia a linha
        linha = new LinhaFerroviaria(recursosEstacionados);
        System.out.println("ocupação da linha : " + linha.getOcupacao());
        
    }   
}
