/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista03;

/**
 *
 * @author LABCCET
 */
public class ex04 {

     public static void main(String[] args) {

         Ponto p0 = new Ponto(0,0);
         Ponto p1 = new Ponto(10,10);
         
         Retangulo ret = new Retangulo(p0,p1);
         
         System.out.println("comprimento = " + ret.getComprimento());
         System.out.println("largura = " + ret.getLargura());
         System.out.println("area = " + ret.getArea());
         System.out.println("perimetro = " + ret.getPerimetro());
     }

}
