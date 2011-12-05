/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista05.ex02;

import java.util.Scanner;

/**
 *
 * @author LABCCET
 */
public class Exemplo {

    public static void main(String[] args) {


        double valor = 0d;
        boolean entradaValida = false;

        do {
           

            try {
                System.out.println("Entre valor: ");
                Scanner input = new Scanner(System.in);
                String stringEntrado = input.nextLine();
                valor = Double.parseDouble(stringEntrado);
                entradaValida = true;
            }
            catch (Exception e){
                  System.out.println("o valor não é válido, tente novamente.");
            }
        } while (!entradaValida);
        
        System.out.println("valor em double = " + valor);

    }

    public static double entraValor(Scanner input) {
        return 0;
    }

}
