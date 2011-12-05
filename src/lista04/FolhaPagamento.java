/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista04;

/**
 *
 * @author Afonso // uniriotec br
 */
public class FolhaPagamento {
    
    public static void main(String[] args) {
        
        Empregado[] e = new Empregado[3];
        e[0] = new EmpregadoHorista(100, 10, "zeno");
        e[1] = new EmpregadoAssalariado(2000, 0.1, "fernanda");
        e[2] = new EmpregadoBonificado(2000, 0.1, 0.1, "afonso");
        
        imprimeEmpregados(e);
        
    }
    
    public static void imprimeEmpregados(Empregado[] e) {
        for (int i = 0; i < e.length; i++) {
           System.out.println("nome = " + e[i].getNome());
           System.out.println("regime = " + e[i].getRegime());
           System.out.println("salario liquido = " + e[i].valorLiquido());
           System.out.println("");
           
            
        }
    }
    
}
