/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Afonso // uniriotec br
 */
public class ex04 {
    
     public static void main(String[] args) {

         //
         String iniciais = "";

         //entrada
         System.out.print("entre com o nome: ");
         Scanner scanner = new Scanner(System.in);
         String nome = scanner.nextLine().toUpperCase();

         String[] partes = nome.split("\\s+");
         String[] conectores = {"E", "DO", "DE"};
         Arrays.sort(conectores);

         for (String parte : partes) {

                if (Arrays.binarySearch(conectores, parte) < 0)
                    iniciais += parte.charAt(0);
         }

         System.out.println(iniciais);
         
     }
    
}
