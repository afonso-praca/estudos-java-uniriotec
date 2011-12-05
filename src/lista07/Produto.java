/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista07;


/**
 *
 * @author LABCCET
 */
public class Produto implements Comparable<Produto>{

    private String nome;
    private int codigo;
    private int preco;

    @Override
    public int compareTo(Produto o) {
       return this.getCodigo().compareTo(o.getCodigo());
    }

    @Override
    public String toString() {
        return "codigo " + getCodigo() + " - nome " + getNome() + " - preço " + getPreco();
    }
    
    @Override
    public boolean equals(Object obj)  {
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        Produto outro = (Produto) obj;
        return(this.getCodigo().equals(outro.getCodigo()) && this.getNome().equals(outro.getNome()));
    }

    @Override
    public int hashCode() {
        return 1;
    }

     public Produto() {

    }

    public Produto(String nome, int codigo, int preco) {
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

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }



}
