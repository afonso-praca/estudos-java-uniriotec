/*
 * Faça um programa que leia o conteúdo do arquivo gerado no programa anterior e
 * imprima a média dos números presentes no arquivo.
 */
package lista06;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 *
 * @author Afonso // uniriotec br
 */
public class ex05 {
    
    public static void main(String[] args) {
        
        DataInputStream reader = null;
        
        try {
            try {
                reader = new DataInputStream(
                        new FileInputStream("arquivo_binario_output.xyz"));
                
                int num = reader.readInt();
                System.out.println(num);
                
            } finally {
                
            }
        } catch (Exception e) {
            System.out.println("problema no acesso ao arquivo");
        }
        
    }
    
}
