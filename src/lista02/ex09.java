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
public class ex09 {
    
      public static void main(String[] args) {
        String texto;
        Scanner input = new Scanner(System.in);
        System.out.print("entre o texto : ");
        texto = input.nextLine();
        String textoEmMaiusculas = texto.toUpperCase();

        final int numletras = 'Z' - 'A' + 1;
        int[] contadores = new int[24];
        for (int i = 0; i < textoEmMaiusculas.length(); i++){
            char c = textoEmMaiusculas.charAt(i);
            if (Character.isLetter(c))
                contadores[c - 'A']++;
        }

        // imprimir os contadores
    }
    
}
