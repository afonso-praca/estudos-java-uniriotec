/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista05_ex01;

/**
 *
 * @author John Lennon
 */
public interface ProdutoDAO {
    void armazenar(Produto p) throws DAOException;
    Produto recuperar(String codigoProduto) throws DAOException;
}
