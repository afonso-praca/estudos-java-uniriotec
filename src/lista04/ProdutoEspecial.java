/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista04;

/**
 *
 * @author LABCCET
 */
public class ProdutoEspecial extends Produto {

    private double desconto;

    public ProdutoEspecial(String nome, int preco) {
        this.setPreco(11000);
    }



    public ProdutoEspecial(String nome, int preco, double desconto) {
        super(nome, preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public int getPreco(){
        return (int) (super.getPreco() - super.getPreco()*desconto);
    }


}
