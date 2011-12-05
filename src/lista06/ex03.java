/*
 * Faça um programa que leia um texto do arquivo gerado no exercício anterior e imprima
 * no console o seu conteúdo.
 */
package lista06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Afonso // uniriotec br
 */
public class ex03 {
    
    public static void main(String[] args) {
        
        BufferedReader reader = null;
        
        try {
            try {
                reader = new BufferedReader( new FileReader("texto.txt"), 3200);
                String texto;
                
                do {
                    texto = reader.readLine();
                    if (texto != null) {
                        System.out.println(texto);
                    }
                } while (texto != null);
                
            } finally {
                if (reader != null) {
                    reader.close();
                }
            }
        } catch (IOException e) {
            System.out.println("Deu erro no acesso ao arquivo");
        }
        
        
    }
    
}
