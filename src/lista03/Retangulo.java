/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista03;

/**
 *
 * @author LABCCET
 */
public class Retangulo {

    private Ponto topLeft;
    private Ponto bottomRigth;

    public Retangulo(Ponto topLeft, Ponto bottomRigth) {
        this.topLeft = topLeft;
        this.bottomRigth = bottomRigth;
    }

    public Retangulo() {
        this.topLeft = new Ponto(0,0);
        this.bottomRigth =new Ponto(0,0);
    }

    public Ponto getBottomRigth() {
        return bottomRigth;
    }

    public void setBottomRigth(Ponto bottomRigth) {
        this.bottomRigth = bottomRigth;
    }

    public Ponto getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Ponto topLeft) {
        this.topLeft = topLeft;
    }

    public int getComprimento(){
        return bottomRigth.getX() - topLeft.getX();
    }

    public int getLargura(){
        return bottomRigth.getY() - topLeft.getY();
    }

    public int getArea(){
        return getComprimento() * getLargura();
    }

    public int getPerimetro(){
        return 2 * getComprimento() + 2 * getLargura();
    }
}
