/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista06_ex04;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;

/**
 *
 * @author John Lennon
 */
public class ex08 {
    public static void main(String[] args) {
        
         Produto[] produtos = new Produto[3];
        produtos[0] = new Produto("bunda", 23, 12);
        produtos[1] = new Produto("bunda2", 24, 12);
        produtos[2] = new Produto("bunda3", 25, 12);
        
        XMLEncoder writer = null;
        
        try {
            try {
                writer = new XMLEncoder(
                        new FileOutputStream("objs.xml"));
                writer.writeObject(produtos);
            } finally {
                if (writer != null)
                    writer.close();
            }
        } catch (Exception e) {
            System.out.println("erro");
        }
    }
}
