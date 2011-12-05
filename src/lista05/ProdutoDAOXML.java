/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista05;

/**
 *
 * @author LABCCET
 */
public class ProdutoDAOXML implements ProdutoDAO {

    private final int MAX_NUM_PRODUTOS = 1000;
    private int numProdutosArmazendaos = 0;
    private Produto[] produtos = new Produto[MAX_NUM_PRODUTOS];

    @Override
    public void armazenar(Produto p) {
       // xml code
    }

    @Override
     public Produto recuperar(String codigo) {

       // xml code
        return null;
    }

}
