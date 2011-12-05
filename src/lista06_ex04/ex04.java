/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista06_ex04;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 *
 * @author John Lennon
 */
public class ex04 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        DataOutputStream writer = null;
       
        for (int i = 0; i < 10; i++) {
            System.out.println("entre o numero: ");
            numeros[i] = input.nextInt();
        }
        
        try {
            try {
                
                writer = new DataOutputStream(
                        new FileOutputStream("saida.txt")
                        );
                
                for (int i = 0; i < numeros.length; i++) {
                    int j = numeros[i];
                    writer.writeInt(j);
                }
                
            } finally {
                if (writer != null)
                    writer.close();
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
