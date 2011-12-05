/*
 *  Crie uma interface ProdutosDAO que define uma operação para salvar um array de
 * objetos da classe Produto.
 *  Crie uma implementação desta interface que armazene o array em um arquivo via
 * serialização binária (classe ProdutoDAOSerBinaria).
 *  Crie uma implementação desta interface que armazene o array em um arquivo via
 * serialização XML (classe ProdutoDAOXML).
 *  Crie um programa que pergunte para o usuário o nome da classe que implementa o
 * método de armazenamento desejado e a partir dessa entrada, armazene 3 produtos
 * (criados no próprio programa como nos exercícios 6 e 8) utilizando um objeto da
 * classe digitada pelo usuário (ProdutoDAOSerBinaria ou ProdutoDAOXML). Utilize
 * Reflection para instanciar a implementação DAO apropriada.
 */

package lista06;


import java.lang.reflect.Method;
import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author LABCCET
 */
public class ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produto[] produtos = new Produto[10];

        Method[] methods = produtos[0].getClass().getMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }
        System.out.println("entre nome da classe para armazenamento: ");
        String nomeClasse = input.nextLine();
//        try {
//            Class classeDAO = Class.forName(nomeClasse);
//          //  ProdutoDAO dao = (ProdutoDAO) classeDAO.newInstance();
////            if (nomeClasse.equals("ProdutoDAOSerBinaria"))
////                dao = new ProdutoDAOSerBinaria();
////            else if (nomeClasse.equals("ProdutoDAOSerXML"))
////                dao = new ProdutoDAOSerXML();
//         //   dao.salvarProdutos(produtos);
//        } catch (InstantiationException ex) {
//          //  Logger.getLogger(Exercicio10.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//           // Logger.getLogger(Exercicio10.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            // Logger.getLogger(Exercicio10.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
}
