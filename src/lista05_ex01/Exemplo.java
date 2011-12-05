/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista05_ex01;

/**
 *
 * @author John Lennon
 */
public class Exemplo {
    public static void main(String[] args) throws DAOException {
        
        Produto[] produtos = new Produto[10];
        ProdutoDAOMemory dao = new ProdutoDAOMemory();
        
        produtos[0] = new Produto("001", "bunda", 12);
        salvarProduto(produtos[0], dao);
        
        System.out.println("numero de prods armazenados = " + dao.getNumProdArmazenados());
        
        try {
            dao.recuperar("004");
        } catch (DAOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public static void salvarProduto(Produto p, ProdutoDAO dao) throws DAOException {
        try {
        dao.armazenar(p);
        } catch (DAOException e) {
            
        }
    }
}
