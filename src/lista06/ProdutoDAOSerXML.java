
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import lista06.Produto;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABCCET
 */
public class ProdutoDAOSerXML implements ProdutoDAO {
    private static final String ARQUIVO_PRODUTOS = "produtos.xml";

    public void salvarProdutos(Produto[] produtos) {
       XMLEncoder writer = null;

       try {
         try {
            writer = new XMLEncoder(
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
        XMLDecoder reader = null;
        Produto[] produtos = new Produto[0];

        try {
            try {
                reader = new XMLDecoder(
                           new FileInputStream(ARQUIVO_PRODUTOS));
                produtos = (Produto[]) reader.readObject();
            } finally {
                if (reader != null)
                   reader.close();
            }
        } catch (IOException e) {
            System.out.println("Deu erro no acesso ao arquivo");
        }

        return produtos;
    }

}
