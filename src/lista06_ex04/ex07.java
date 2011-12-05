/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista06_ex04;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author John Lennon
 */
public class ex07 {
    public static void main(String[] args) {
        
        ObjectInputStream reader = null;
        Produto[] produtos;

        try {
            try {
                reader = new ObjectInputStream(
                        new FileInputStream("objetos.aapc"));
               
                produtos = (Produto[]) reader.readObject();
                
                for (Produto produto : produtos) {
                    System.out.println(produto.getNome());
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
