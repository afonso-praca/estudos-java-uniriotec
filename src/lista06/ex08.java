/*
 * Seja a mesma classe Produto do exercício 6, faça um programa que instancie alguns
 * produtos (ex: 3 produtos), armazenando suas referências em um array. Em seguida,
 * armazene os dados desses três produtos em um arquivo via serialização em arquivo
 * XML.
 */

package lista06;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;

/**
 *
 * @author LABCCET
 */
public class ex08 {
    public static void main(String[] args) {

        Produto p0 = new Produto("bola", 0, 12.22);
        Produto p1 = new Produto("capa", 1, 22.22);
        Produto p2 = new Produto("arroz", 2, 32.22);

        Produto[] produtos = new Produto[3];
        produtos[0] = p0;
        produtos[1] = p1;
        produtos[2] = p2;
        
        //
        
        XMLEncoder writer = null;
        
        try {
            try {
                writer = new XMLEncoder(
                        new FileOutputStream("produtos.xml"));
                
                writer.writeObject(produtos);
                
                
            } finally {
                if (writer != null)
                   writer.close();
            }
        } catch (Exception e) {
            System.out.println("erro no acesso ao arquivo");
        }
    }
}
