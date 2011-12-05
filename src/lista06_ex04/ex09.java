/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista06_ex04;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author John Lennon
 */
public class ex09 {
    public static void main(String[] args) {
        
        XMLDecoder reader = null;
        Produto[] produtos;
        
        try {
            try {
                reader = new XMLDecoder(
                        new FileInputStream("objs.xml"));
                
                produtos = (Produto[]) reader.readObject();
                
                for (Produto produto : produtos) {
                    System.out.println("nome = " + produto.getNome());
                }
                
            } finally {
                if (reader != null)
                    reader.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
             
    }
}
