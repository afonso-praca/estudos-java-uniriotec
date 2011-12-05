/*
 --------------------------------------------------------------------------------------------
 *
 * Exercício 6
 *
 *	Seja uma classe Produto com atributos nome (string), código (int) e preço (double), faça
 *      um programa que instancie alguns produtos (ex: 3 produtos), armazenando suas
 *      referências em um array. Em seguida, armazene os dados desses três produtos em um
 *      arquivo via serialização binária.
 *
 */

package lista06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author LABCCET
 */
public class ex06 {
    public static void main(String[] args) {
        
        Produto p0 = new Produto("bola", 0, 12.22);
        Produto p1 = new Produto("capa", 1, 22.22);
        Produto p2 = new Produto("arroz", 2, 32.22);

        Produto[] produtos = new Produto[3];
        produtos[0] = p0;
        produtos[1] = p1;
        produtos[2] = p2;
        
        ObjectOutputStream writer = null;

       try {
            try {
                writer = new ObjectOutputStream(
                           new FileOutputStream("produtos.dat"));
                writer.writeObject(produtos);
            } finally {
                if (writer != null)
                   writer.close();
            }
        } catch (IOException e) {
            System.out.println("Deu erro no acesso ao arquivo");
        }        
    }
}
