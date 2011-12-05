/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista04;

/**
 *
 * @author LABCCET
 */
public class Paralelepipedo extends Solido {

    private double alt;
    private double comp;
    private double larg;

    // constructors
    
    public Paralelepipedo() {

    }


    public Paralelepipedo(double densidade, double alt, double comp, double larg) {

        super(densidade);

        this.alt = alt;
        this.comp = comp;
        this.larg = larg;
    }
    
    // getters and setters

    public double getAlt() {
        return alt;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public double getComp() {
        return comp;
    }

    public void setComp(double comp) {
        this.comp = comp;
    }

    public double getLarg() {
        return larg;
    }

    public void setLarg(double larg) {
        this.larg = larg;
    }

    // funções especificas

    @Override
    public double volume() {
        return alt * comp * larg;
    }
}
