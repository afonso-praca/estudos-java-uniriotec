/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista08;

/**
 *
 * @author Afonso // uniriotec br
 */
public class ConversorMoeda {
    
    final static double cotacao = 1.7;
    
    public static double converteParaDolar(double real) {
        double dolar = real * cotacao;
        return dolar;
    }
    
     public static double converteParaReal(double dolar) {
        double real = dolar / cotacao;
        return real;
    }
    
}
