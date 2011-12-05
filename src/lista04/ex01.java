/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista04;

/**
 *
 * @author LABCCET
 */
public class ex01 {

    public static void main(String[] args) {

        Produto[] produtos = new Produto[10];
        produtos[0] =  new ProdutoEspecial("bolsa", 2000, 0.1);
        produtos[1] =  new Produto("vestido", 3900);
        produtos[2] =  new Produto();
        
        imprimeProduto(produtos[0]);
        imprimeProduto(produtos[1]);
        imprimeProduto(produtos[2]);
    }

    public static void imprimeProduto(Produto p) {
        System.out.println( "nome = " + p.getNome());
        System.out.println( "preço = " + p.getPreco());

        if (p instanceof ProdutoEspecial)
        {
             System.out.println( "esse produto é especial");
        }
    }
}
