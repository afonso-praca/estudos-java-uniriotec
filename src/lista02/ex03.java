/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author Afonso
 */
public class ex03 {
    
    public static void main(String[] args){
        
        //vars
        BigDecimal valorSalario;
        double aliquota = 0;
        BigDecimal parcelaDeduzir = new BigDecimal(0.0);
        
         Scanner scanner = new Scanner(System.in);
         System.out.println("entre o valor de seu salario: ");
         valorSalario = scanner.nextBigDecimal();
         //aliquota = scanner.nextBigDecimal();
         
         if (valorSalario.compareTo(new BigDecimal(1499.15)) > 0)
         {
             aliquota = 0.075;
             parcelaDeduzir = new BigDecimal(112.43);
         }
         
         if (valorSalario.compareTo(new BigDecimal(2246.75)) > 0)
         {
             aliquota = 0.15;
             parcelaDeduzir = new BigDecimal(280.94);
         }
           
         if (valorSalario.compareTo(new BigDecimal(2995.70)) > 0)
         {
             aliquota = 0.225;
             parcelaDeduzir = new BigDecimal(505.62);
         }
         
         if (valorSalario.compareTo(new BigDecimal(3743.19)) > 0)
         {
             aliquota = 0.275;
             parcelaDeduzir = new BigDecimal(692.78);
         }
         
         System.out.println("aliquota = " + aliquota + "%");
         System.out.println("parcela a deduzir = " + parcelaDeduzir);
         
         System.out.println("o imposto de renda devido é de " + ((valorSalario.multiply(new BigDecimal(aliquota))).subtract(parcelaDeduzir)));
    }
}
