package edu.gui.study.map.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class contagemVotos {

    public static void main(String[] args) {

        Map<String, Integer> candidatosVotos = new TreeMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                String[] parts = line.split(",");
                String key = parts[0];
                Integer votes = Integer.valueOf(parts[1]);

                candidatosVotos.merge(key, votes, Integer::sum);

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (String key : candidatosVotos.keySet()) {

            System.out.println(key + ": " + candidatosVotos.get(key));

        }


    }
}
