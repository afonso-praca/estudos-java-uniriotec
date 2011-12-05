/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista06_ex04;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author John Lennon
 */
public class ex05 {
    public static void main(String[] args) {
        
        DataInputStream reader = null;
        
        try {
            try {
                reader = new DataInputStream(
                        new FileInputStream("saida.txt")
                        );
                
                for (int i = 0; i < 10.; i++) {
                    System.out.println(reader.readInt());
                }
                
                        


            } finally {

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
