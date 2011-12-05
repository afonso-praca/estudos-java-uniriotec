/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista05_ex01;

/**
 *
 * @author John Lennon
 */
public class Produto {
    
    String codigo;
    String nome;
    int preco;

    public Produto() {
    }

    public Produto(String codigo, String nome, int preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

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
