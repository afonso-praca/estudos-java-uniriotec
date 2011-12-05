/*
 * Faça um programa que leia um texto, entrado linha a linha pelo usuário e grave o
 * conteúdo em um arquivo texto.txt.
 */
package lista06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Afonso // uniriotec br
 */
public class ex02 {
    
     public static void main(String[] args)   {
    
    Scanner input = new Scanner(System.in);
    PrintWriter writer = null;
        
    try {
            try {
                writer = new PrintWriter(
                            new BufferedWriter(
                              new FileWriter("texto.txt"), 32000));
                String texto;
                do {
                    System.out.println("Entre o texto: ");
                     texto = input.nextLine();
                     if (texto.length() > 0) {
                        writer.write(texto);
                        writer.println();
                    }
                } while (texto.length() > 0);
            } finally {
                if (writer != null)
                   writer.close();
            }
        } catch (IOException e) {
            System.out.println("Deu erro no acesso ao arquivo");
        }
    
     }
    
}
