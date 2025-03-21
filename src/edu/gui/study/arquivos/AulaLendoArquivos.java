package edu.gui.study.arquivos;

import java.io.*;
import java.nio.BufferOverflowException;
import java.util.Scanner;

public class AulaLendoArquivos {

    public static void main(String [] args) {

        String path = "c:\\teste\\in.txt";
        File file = new File(path);
        Scanner sc = null;

        try (BufferedReader br = new BufferedReader(new FileReader(path))){


            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());;
        }

        System.out.println("-----------------------");


        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
