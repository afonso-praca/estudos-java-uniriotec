/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lista07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author LABCCET
 */
public class ex01 {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        //Scanner scanner = new Scanner(System.in);

       // boolean novo_numero = true;

        lista.add(10);
        lista.add(13);
        lista.set(0, 22);
        Collections.sort(lista);

        //lista.ensureCapacity(10);

        System.out.println(lista.get(0));

        ArrayList<Object> listaQqCoisa = new ArrayList<Object>();


//        while (novo_numero) {
//            System.out.print("entre o numero: ");
//            if (!scanner.nextLine().equals(""))
//                lista.add(scanner.nextInt());
//            else
//                novo_numero = false;
//        }

        imprimeLista(lista);
        
    }

    public static  void imprimeLista(List<Integer> lista)
    {
         for (int elemento : lista) {
            System.out.println("elemento = " + elemento);
        }
    }

}
