/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista07;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Afonso // uniriotec br
 */
public class ex05 {
    
    public static void main(String[] args) {
        HashSet<Integer> inteiros = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
       
        // Boolean entrando = true;
       
        int total_inteiros = 0;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.print("entre o numero: ");
            total_inteiros++;
            inteiros.add(input.nextInt());
        } while (total_inteiros < 6);
        
        System.out.println(inteiros);
    }
}
