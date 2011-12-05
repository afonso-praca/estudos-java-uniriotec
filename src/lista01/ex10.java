/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01;

import java.util.Scanner;

/**
 *
 * @author Afonso
 */
public class ex10 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        //Área = 4 * PI *  r2 
        //Volume = 4/3 * PI *  r3
        
        
        System.out.print("entre o raio da esfera: ");
        double raio = input.nextDouble();
        
        System.out.println("a area da esfera foi: " + (4 * Math.PI * (Math.pow(raio, 2))));
        System.out.println("o volume da esfera foi: " + ((4/3) * Math.PI * (Math.pow(raio, 3))));
        
    }
    
}
