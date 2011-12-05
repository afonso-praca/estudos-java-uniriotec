/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lista02;

/**
 *
 * @author Afonso // uniriotec br
 */
public class ex10 {
    
     public static void main(String[] args) {
         
         int[][] array = new int[9][]; // defino um array com 9 arrays
        
         
         for (int k = 1; k <= array.length; k++){ // aqui eu defino o tamanho de cada um dos nove arrays
             array[k-1] = new int [100/k];
             for (int divisor = k, col = 0; divisor <= 100; divisor+=k, col++)
             {
                array[k - 1][col] = divisor;
             }
         }

         for (int[] umArray : array) {
             System.out.println("");
             for (int i : umArray)
                 System.out.print(i + " ");
         }

        //array[0] = new int[100]; // aqui eu defino o tamanho de cada um dos nove arrays
        //array[1] = new int[50];
        //array[0] = new int[40];
        //array[0] = new int[30];
        //array[0] = new int[20];
        //array[0] = new int[15];
        //array[0] = new int[10];
        //array[0] = new int[10];
        //array[0] = new int[10];
        //array[0] = new int[10];
        //array[0] = new int[10];

        

        // System.out.println(array[0][0]);
     }
    
}
