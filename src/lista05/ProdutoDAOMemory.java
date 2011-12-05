/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista05;

/**
 *
 * @author LABCCET
 */
public class ProdutoDAOMemory implements ProdutoDAO {
    
    private final int MAX_NUM_PRODUTOS = 1;
    private int numProdutosArmazendaos = MAX_NUM_PRODUTOS;
    private Produto[] produtos = new Produto[MAX_NUM_PRODUTOS];

    public int getNumProdutosArmazendaos() {
        return numProdutosArmazendaos;
    }

    

    @Override
    public void armazenar(Produto p) throws DAOException, ProdutoException {

        for (int i = 0; i < numProdutosArmazendaos; i++) {

            Produto produto = produtos[i];

            if (p.getCodigo().equals(produto.getCodigo()))
            {
                produto.setNome(p.getNome());
                produto.setPrecoUnitario(p.getPrecoUnitario());
                throw new DAOException("ja existe produto com esse nome");
            }
        }

        System.out.println("to aqui");

        if (numProdutosArmazendaos < MAX_NUM_PRODUTOS) {
            produtos[numProdutosArmazendaos++] = p;
        }
        else
        {
            throw new DAOException("não há mais espaço para armazenar o produto");
        }
    }

    @Override
    public Produto recuperar(String codigo) throws DAOException {

        for (int i = 0; i < numProdutosArmazendaos; i++) {
            if (produtos[i].getCodigo().equals(codigo))
                return produtos[i];
        }
        throw new DAOException("o produto não existe");
    }

}
