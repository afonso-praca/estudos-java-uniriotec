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
public class ex01 {
    
     public static void main(String[] args) {

        // palindromo

        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o string: ");

        String entrada = input.nextLine();
        String entradaMaiuscula = entrada.toUpperCase();

        int numComparacoes = entrada.length() / 2;
        boolean isPalindromo = true;

        for (int i = 0; i < numComparacoes; i++)
        {
            if (entrada.charAt(i) != entrada.charAt(entrada.length() - 1 - i))
            {
                isPalindromo = false;
                break;
            }
        }

        // fim palidromo

        // numero de vogais e 
         int numVogais = 0;
         int numDigitos = 0;

         for (int i = 0; i < entrada.length(); i++)
        {
           // if (Character.toUpperCase(entrada.charAt(i)) == 'A' ||
              if (entradaMaiuscula.charAt(i) == 'A' ||
                    entradaMaiuscula.charAt(i) == 'E' ||
                    entradaMaiuscula.charAt(i) == 'I' ||
                    entradaMaiuscula.charAt(i) == 'O' ||
                    entradaMaiuscula.charAt(i) == 'U')
                numVogais++;

              if (Character.isDigit(entradaMaiuscula.charAt(i)))
                  numDigitos++;

            System.out.println("numero de vogais = " + numVogais);
            System.out.println("numero de digitos = " + numDigitos);
        }

         // se começa com bra

         if (entradaMaiuscula.startsWith("BRA", 2))
             System.out.println("é bra");


            String x1 = "ABC";
            String x2 = "ABC";

            String y1 = new String("ABC");
            String y2 = new String("ABC");

            //System.out.println(x1 == y2);
            //System.out.print(x1 equals y2);

        //System.out.println(entrada);

           System.out.println(isPalindromo ? "palindromo" : "não é palindromo");


    }
     
}
