/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista04;

/**
 *
 * @author LABCCET
 */
public class ex02 {

    public static void main(String[] args) {

       Solido[] solidos = new Solido[4];
       
       solidos[0] = new Esfera(2.0, 10);
       solidos[1] = new Esfera(1.0, 20);
       solidos[2] = new Paralelepipedo(2.0, 10.0, 10.0, 10.0);
       solidos[3] = new Paralelepipedo(1.0, 5.0, 1.3, 1.6);

       double massaTotal = 0.0;
       double volumeTotal = 0.0;

        for (Solido solido : solidos) {
            imprimeSolido(solido);

            massaTotal += solido.massa();
            volumeTotal += solido.volume();
        }

       System.out.println("volume total = " + volumeTotal);
       System.out.println("massa total = " + massaTotal);
   }

    private static void imprimeSolido(Solido s) {
       System.out.println("volume = " + s.volume());
       System.out.println("massa = " + s.massa());
       System.out.println("tipo = " + s.getClass().getName());

       System.out.println("");
    }
}

    


