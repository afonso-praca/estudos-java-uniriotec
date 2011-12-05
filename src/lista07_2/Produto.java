/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista07_2;


/**
 *
 * @author LABCCET
 */
public class Produto implements Comparable<Produto> {

    private String nome;
    private int codigo;
    private double preco;

    @Override
    public int compareTo(Produto o) {
        return 3;
    }
    
    @Override
    public String toString() {
        return "codigo " + getCodigo() + " - nome " + getNome() + " - preço " + getPreco();
    }

   
    
    public Produto() {

    }

    public Produto(String nome, int codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }



}
