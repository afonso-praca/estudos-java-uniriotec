/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista07_2;

import java.util.Collections;
import java.util.TreeSet;

/**
 *
 * @author John Lennon
 */
public class ex08 {
    public static void main(String[] args) {
        
        Produto p0 = new Produto("bunda0", 12, 12);
        Produto p1 = new Produto("bunda1", 13, 12);
        Produto p2 = new Produto("bunda2", 14, 12);
        
        TreeSet<Produto> produtos_tree = new TreeSet<Produto>();
        
        produtos_tree.add(p0);
        produtos_tree.add(p1);
        produtos_tree.add(p2);
        
        for (Produto produto : produtos_tree) {
            System.out.println(produto.toString());
        }
        
        
    }
}
