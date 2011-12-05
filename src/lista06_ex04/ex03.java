/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista06_ex04;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author John Lennon
 */
public class ex03 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        
        try {
            try {
                reader = new BufferedReader(
                        new FileReader("arquivot.txt"));
                System.out.println(reader.readLine());
                
            } finally {
                if (reader != null)
                    reader.close();
            }
        } catch (Exception e) {
            
        }
    }
}
