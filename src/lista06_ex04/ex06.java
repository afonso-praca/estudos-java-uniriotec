/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista06_ex04;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author John Lennon
 */
public class ex06 {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[3];
        produtos[0] = new Produto("bunda", 23, 12);
        produtos[1] = new Produto("bunda2", 24, 12);
        produtos[2] = new Produto("bunda3", 25, 12);
        
        ObjectOutputStream writer = null;
        
        try {
            try {
                writer = new ObjectOutputStream(
                        new FileOutputStream("objetos.aapc"));
                writer.writeObject(produtos);
            } finally {
                if (writer != null)
                    writer.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
