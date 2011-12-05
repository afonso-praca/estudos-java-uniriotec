/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import lista06.Produto;

/**
 *
 * @author LABCCET
 */
public class ProdutoDAOSerBinaria implements ProdutoDAO {
    private static final String ARQUIVO_PRODUTOS = "produtos.dat";

    public void salvarProdutos(Produto[] produtos) {
       ObjectOutputStream writer = null;

       try {
         try {
            writer = new ObjectOutputStream(
                           new FileOutputStream(ARQUIVO_PRODUTOS));
            writer.writeObject(produtos);
        } finally {
            if (writer != null)
               writer.close();
        }
      } catch (IOException e) {
        System.out.println("Deu erro no acesso ao arquivo");
      }
    }

    public Produto[] obterProdutos() {
        ObjectInputStream reader = null;
        Produto[] produtos = new Produto[0];

        try {
            try {
                reader = new ObjectInputStream(
                           new FileInputStream(ARQUIVO_PRODUTOS));
                produtos = (Produto[]) reader.readObject();
            } finally {
                if (reader != null)
                   reader.close();
            }
        } catch (IOException e) {
            System.out.println("Deu erro no acesso ao arquivo");
        } catch (ClassNotFoundException e) {
            System.out.println("Arquivo com conteudo inconsistente");
        }

        return produtos;
    }


}
