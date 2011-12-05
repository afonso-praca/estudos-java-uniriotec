/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista05_ex01;

/**
 *
 * @author John Lennon
 */

public class ProdutoDAOMemory implements ProdutoDAO{
    
    Produto[] produtos = new Produto[100];
    int numProdArmazenados = 0;

    public int getNumProdArmazenados() {
        return numProdArmazenados;
    }
    
    @Override
    public void armazenar(Produto p) throws DAOException {
        produtos[numProdArmazenados] = p;
        numProdArmazenados++;
    }
    
    @Override
    public Produto recuperar(String codigoProduto) throws DAOException {
        for (int i = 0; i < numProdArmazenados; i++) {
           if (produtos[i].getCodigo().equals(codigoProduto))
               return produtos[i];
        }
        throw new DAOException("produto não encontrado");
    }
}
