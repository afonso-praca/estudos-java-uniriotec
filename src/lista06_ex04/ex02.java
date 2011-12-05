/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista06_ex04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author John Lennon
 */
public class ex02 {
    public static void main(String[] args) {
        
        PrintWriter writer = null;
        Scanner input = new Scanner(System.in);
        
        System.out.println("entre a linha a ser gravada");
        String txt = input.nextLine();
        
        try {
            try {
                writer = new PrintWriter(
                        new BufferedWriter(
                                new FileWriter("arquivot.txt"), 3200));
                
                writer.write(txt);
            } finally {
                if (writer != null)
                    writer.close();
            }
        } catch (Exception e) {
            System.out.println("erro na gravação");
        }
        
    }
}
