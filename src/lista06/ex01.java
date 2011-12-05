/*
 * Faça um programa que liste os arquivos existentes no diretório estabelecido pelo usuário
 * e liste o nome, tamanho e data da última modificação de todos os arquivos existentes
 * neste diretório.
 */

package lista06;

import java.util.Scanner;
import java.io.File;

/**
 *
 * @author LABCCET
 */
public class ex01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("entre com o diretorio desejado: ");
        String str_dir = scanner.nextLine();

        File dir = new File(str_dir);
        File[] files = dir.listFiles();

         for (File file : files){
             //String tipo = file.isDirectory() ? "Dir" : "File";

             System.out.println("/nnome: " + file.getName());
             System.out.println("/tamanho: " + file.getTotalSpace() + " bytes");
             System.out.println("modificado em: " + file.lastModified());

        }
    }
}
