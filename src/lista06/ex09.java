/*
 * Faça um programa que leia o array serializado no exercício anterior (em XML) e imprima
 * os dados dos produtos armazenados (nome, código e preço).
 */

package lista06;

import java.beans.XMLDecoder;
import java.io.FileInputStream;


/**
 *
 * @author LABCCET
 */
public class ex09 {
    public static void main(String[] args) {
        
        XMLDecoder reader = null;
        Produto[] produtos;

        try {
            try {
                reader = new XMLDecoder(
                        new FileInputStream("produtos.xml"));
                        produtos = (Produto[]) reader.readObject();

                        for (Produto p : produtos) {
                            System.out.println(p.getNome() + " - " + p.getPreco() + " - " + p.getCodigo());
                        }
            } finally {
                if (reader != null)
                    reader.close();
            }
        } catch (Exception e) {
            System.out.println("erro no acesso ao arquivo");
        }

    }
}
