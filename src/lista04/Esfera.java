/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista04;

/**
 *
 * @author LABCCET
 */
public class Esfera extends Solido{

    private double raio;

     // constructors

    public Esfera() {
        
    }

    public Esfera(double densidade, double raio) {

        super(densidade);
        this.raio = raio;
    }
    
    // getters e setters

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

     // funções especificas

    @Override
    public double volume() {
        return (4.0/3.0) * Math.PI * Math.pow(raio, 3);
    }

    



    


}
