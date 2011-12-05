/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista06_ex04;

//import java.io.Serializable;

import java.io.Serializable;


/**
 *
 * @author LABCCET
 */
public class Produto implements Serializable {

    private String nome;
    private int codigo;
    private double preco;

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
