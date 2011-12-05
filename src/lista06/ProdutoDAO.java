
import lista06.Produto;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABCCET
 */
public interface ProdutoDAO {
    void salvarProdutos(Produto[] produtos);
    Produto[] obterProdutos();
}
