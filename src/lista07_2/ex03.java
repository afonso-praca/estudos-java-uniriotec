/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista07_2;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.util.ArrayList;

/**
 *
 * @author John Lennon
 */
public class ex03 {
    public static void main(String[] args) {
        ArrayList<Integer> inteiros;
        XMLDecoder reader = null;
        
        try {
            try {
                reader = new XMLDecoder(
                        new FileInputStream("nums.xml"));
                
                inteiros = (ArrayList<Integer>) reader.readObject();
                
                for (Integer integer : inteiros) {
                    System.out.println(integer.intValue());
                }
                
            } finally {
               if (reader != null)
                   reader.close();
            }
        } catch (Exception e) {
            System.out.println("erro");
        }
    }
}

