/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista05;

/**
 *
 * @author LABCCET
 */
public class ExemploB {
    public void salvarProduto(Produto p, ProdutoDAO dao) throws DAOException, ProdutoException {
        try {
            dao.armazenar(p);
        } catch (DAOException e) {
            System.out.println("erro ao tentar armazenar o produto");
            throw e;
        }
    }

}
