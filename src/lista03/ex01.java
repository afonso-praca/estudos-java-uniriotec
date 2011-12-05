/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03;

/**
 *
 * @author Afonso
 */
public class ex01 {
    
    public static void main(String[] args) {
        
        Empregado[] empregados = new Empregado[10];
        
        empregados[0] = new Empregado("afonso", 250000, 0.0, 167);
        empregados[1] = new Empregado("pedro", 390000, 0.05, 178);
        empregados[2] = new Empregado("malt", 250000, 0.0, 174);
        empregados[3] = new Empregado("fernanda", 240000, 0.05, 174);
        empregados[4] = new Empregado("zeno", 280000, 0.1, 174);
        
        for (int i = 0; i < Empregado.getNumEmpregados(); i++) {
            System.out.println(empregados[i].getNome() + " - salario liquido = " + empregados[i].getSalarioComDesconto());
        }
        
    } 
    
}
