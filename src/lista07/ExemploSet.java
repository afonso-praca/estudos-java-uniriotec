/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista07;

import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author LABCCET
 */
public class ExemploSet {

    public static void main(String[] args) {

        HashSet<Produto> produtos = new HashSet<Produto>();
        Produto p = new Produto("bola", "2345", 3456);

        produtos.add(p);
        System.out.println(produtos);

        TreeSet<Produto> tree = new TreeSet<Produto>();
        tree.add(p);

        TreeSet<Integer> numeros = new TreeSet<Integer>();
        numeros.add(10);
        numeros.add(34);
        numeros.add(33);

        System.out.println(numeros);

    }

  
}
