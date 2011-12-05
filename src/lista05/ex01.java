/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista05;

/**
 *
 * @author LABCCET
 */
public class ex01 {

    public static void main(String[] args) throws DAOException {

        ProdutoDAOMemory dao = new ProdutoDAOMemory();

        Produto p1 = new Produto("1233", "chocolate", 400);
        Produto p2 = new Produto("1253", "leite", 350);
        Produto p3 = new Produto("1253", "leite de cabra", 350);

        try {
            salvarproduto(dao, p2);
            salvarproduto(dao, p3);
            salvarproduto(dao, p1);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("numero total de produtos cadastrados = " + dao.getNumProdutosArmazendaos());

        try {
            System.out.println(dao.recuperar("1253").getNome());
        }
        catch(DAOException e) {
            System.out.println(e.getMessage());
            
        }
    }

    public static void salvarproduto(ProdutoDAO dao ,Produto p) throws DAOException, ProdutoException{
            dao.armazenar(p);
            System.out.println("salvou");
            System.out.println(dao.recuperar("1253").getNome());
    }
}