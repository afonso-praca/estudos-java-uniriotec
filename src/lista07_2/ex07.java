/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista07_2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 *
 * @author John Lennon
 */
public class ex07 {
    public static void main(String[] args) {
        
        HashSet<Produto> produtos = new HashSet<Produto>();
        TreeSet<Produto> produtos_tree = new TreeSet<Produto>();
        LinkedList<Produto> produtos_linked = new LinkedList<Produto>();
        
        Produto p0 = new Produto("bunda0", 12, 12);
        Produto p1 = new Produto("bunda1", 13, 12);
        Produto p2 = new Produto("bunda2", 14, 12);
        
        produtos.add(p0);
        produtos.add(p1);
        produtos.add(p2);
        
        produtos_tree.add(p0);
        produtos_tree.add(p1);
        produtos_tree.add(p2);
        
        produtos_linked.add(p0);
        produtos_linked.add(p1);
        produtos_linked.add(p2);
        
        
        Produto prodAlvo = new Produto("bunda0", 12, 12);
        
        if (produtos.contains(prodAlvo)) 
            System.out.println("pertence à coleção");
        else
            System.out.println("não pertence à coleção");
    }
}
