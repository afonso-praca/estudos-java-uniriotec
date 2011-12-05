/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista07_2;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John Lennon
 */
public class ex02 {
        public static void main(String[] args) {
        
        XMLEncoder writer = null;
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
        
        try {
            try {
                writer = new XMLEncoder(
                        new FileOutputStream("nums.xml"));
                
                writer.writeObject(numeros);
                
                
            } finally {
                if (writer != null)
                    writer.close();
            }
        } catch (Exception e) {
            System.out.println("bug");
        }
        
        
    }
}
