/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista05;

/**
 *
 * @author LABCCET
 */
public class testaExec {

    public static void main(String[] args) {

        ExemploA exa = new ExemploA();
        Produto p = new Produto("567", "bunda", 33);
        ProdutoDAOMemory dao = new ProdutoDAOMemory();

        try {
            exa.salvarProduto(p, dao);
        } catch (Exception e) {
            
        }

    }

}
