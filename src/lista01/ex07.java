package lista01;

import java.util.Scanner;

/**
 *
 * @author Afonso
 */
public class ex07 {
    
    public static void main (String[] args){
        
        //scanner
        Scanner input = new Scanner(System.in);
        
        //recebimento dos valores
        System.out.print("entre o menor numero : ");
        int numMenor = input.nextInt();
        System.out.print("entre o maior numero : ");
        int numMaior = input.nextInt();
        System.out.print("\n");
        
        // A soma dos inteiros que estão na faixa
        int somaInteirosFaixa = 0;
        int numIntFaixa = 0;
        int numIntImpar = 0;
        
        for (int i = numMenor; i <= numMaior; i++) {
            somaInteirosFaixa += i;
            numIntFaixa++;
            if ((i%2) != 0)
                numIntImpar++;
        }
        
        System.out.println("soma dos inteiros que estão na faixa : " + somaInteirosFaixa);
        System.out.println("número de inteiros dentro da faixa : " + numIntFaixa);
        System.out.println("número de inteiros impares dentro da faixa : " + numIntImpar);
        System.out.print("\n");
        
        // divisores
         for (int i = numMenor; i <= numMaior; i++) {
             System.out.print("divisores de " + i + ": ");
             for (int j = numMenor; j <= numMaior; j++) {
                 if ((i%j) == 0)
                     System.out.print(j + ", ");
             }
              System.out.println("");
         }
    }
    
}