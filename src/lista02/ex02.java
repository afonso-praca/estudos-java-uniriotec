/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02;

import java.util.Scanner;

/**
 *
 * @author Afonso // uniriotec br
 */
public class ex02 {
    
    public static void main(String[] args) {

        int numero;

        String[] digitosPorExtenso = {
            "zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"
        };

        Scanner input = new Scanner(System.in);
        System.out.print("Entre o numero: ");
        numero = input.nextInt();

        String numeroString = String.valueOf(numero);

        for (int j = 0; j < numeroString.length(); j++)
        {
            char digito = numeroString.charAt(j);
            int digitoInt = (int) digito;
            int indice = digitoInt - '0';

            System.out.print(digitosPorExtenso[indice] + " ");
            //System.out.print(digitosPorExtenso[Integer.parseInt(digito)]);
        }
    }
    
}
