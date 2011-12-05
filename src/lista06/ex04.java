/*
 * Faça um programa que permita que o usuário entre 10 números a partir do console e
 * armazene esses 10 números em um arquivo em formato binário.
 */

package lista06;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Afonso // uniriotec br
 */
public class ex04 {
    
    public static void main(String[] args) {
        
        DataOutputStream writer = null;
        Scanner input = new Scanner(System.in);
        
        try {
            try {
                writer = new DataOutputStream(
                        new FileOutputStream("arquivo_binario_output.xyz"));
                
                int num = 0;
                
                for (int i = 0; i < 10; i++) {
                    System.out.print("entre com o numero " + (i+1) + ": ");
                    num = input.nextInt();
                    writer.writeInt(num);
                }
                
            } finally {
                if (writer != null) {
                    writer.close();
                }
            }
        } catch (IOException e) {
            System.out.println("Deu erro no acesso ao arquivo");
        }
        
    }
    
}
