/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista07_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author John Lennon
 */
public class ex01 {
    
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        
        Boolean entrando = true;
        
        while (entrando == true) {
            System.out.print("entre com um numero ou -1 para encerrar a entrada: ");
            int num = input.nextInt();
            if (num != -1) {
                numeros.add(num);
            } else {
                entrando = false;
            }
        }
        
        Collections.sort(numeros);
        
        int soma = 0;
        
        for (Integer integer : numeros) {
            soma += integer.intValue();
        }
        
        System.out.println("soma = " + soma);
        System.out.println("media = " + soma/numeros.size());
        
    }
    
}
