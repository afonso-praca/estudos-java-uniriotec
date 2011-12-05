/*
 * Faça um programa que leia o array serializado no exercício anterior e imprima os dados
 * dos produtos armazenados (nome, código e preço).
 */
package lista06;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author Afonso // uniriotec br
 */
public class ex07 {
    
    public static void main(String[] args) {
        
        ObjectInputStream reader = null;
        Produto[] produtos;
        
        try {
            try {
                
                reader = new ObjectInputStream(
                        new FileInputStream("produtos.dat"));
                
                produtos = (Produto[]) reader.readObject();
                
                for (Produto p: produtos) {
                    System.out.println(p.getCodigo() + " - " +
                            p.getNome() + " - " + p.getPreco());
                }
                
            } finally {
                
            }
        } catch (Exception e) {
            System.out.println("erro no acesso ao arquivo");
        }
                
                
        
    }
    
}
