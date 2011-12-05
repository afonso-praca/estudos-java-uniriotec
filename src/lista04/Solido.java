/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista04;

/**
 *
 * @author LABCCET
 */
public abstract class Solido {

    private double densidade;


    // constructors

    public Solido() {

    }

    public Solido(double densidade) {
        this.densidade = densidade;
    }

    // getters and setters

    public double getDensidade() {
        return densidade;
    }

    public void setDensidade(double densidade) {
        this.densidade = densidade;
    }

    // funções especificas

    public abstract double volume();

    public double massa(){

        return getDensidade() * volume();
    }
}
