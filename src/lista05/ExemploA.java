/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista05;

/**
 *
 * @author LABCCET
 */
public class ExemploA {
    public void salvarProduto(Produto p, ProdutoDAO dao) throws DAOException, ProdutoException {
        dao.armazenar(p);
    }
}
