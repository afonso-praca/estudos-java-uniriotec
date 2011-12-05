/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista07;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author LABCCET
 */
public class ExemploMap {
    public static void main(String[] args) {
        HashMap<String, Produto> produtos = new HashMap<String, Produto>();
        Produto p1 = new Produto("bola", "11", 2000);
        Produto p2 = new Produto("cabo", "33", 3487);

        produtos.put(p1.getCodigo(), p1);
        produtos.put(p2.getCodigo(), p2);

        System.out.println("entre o codigo do produto: ");
        Scanner input = new Scanner(System.in);
        String codigo = input.nextLine();
        Produto prod = produtos.get(codigo);

        if (prod != null)
            System.out.println(prod);
        else
            System.out.println("produto não encontrado");
    }
}
