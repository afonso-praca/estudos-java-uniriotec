/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista05;

/**
 *
 * @author LABCCET
 */
public interface ProdutoDAO {

    void armazenar(Produto p) throws DAOException, ProdutoException;
    Produto recuperar(String codigo) throws DAOException;
}
