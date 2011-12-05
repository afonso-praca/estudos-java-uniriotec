/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista04;

/**
 *
 * @author LABCCET
 */
public class Produto {

    private String nome;
    private int preco;

    public Produto() {
        
    }



    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    

}
