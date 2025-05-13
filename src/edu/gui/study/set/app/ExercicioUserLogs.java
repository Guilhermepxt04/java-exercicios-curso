package edu.gui.study.set.app;

import edu.gui.study.set.model.entities.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioUserLogs {

    public static void main(String[] args) throws IOException {

        Set<User> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

         try (BufferedReader br = new BufferedReader(new FileReader(path))) {

             String line = br.readLine();

             while (line != null) {
                 String[] parts = line.split(" ");
                 Instant login = Instant.parse(parts[1]);
                 User user = new User(parts[0], login);
                 set.add(user);
                 line = br.readLine();
             }
         } catch (IOException e) {
             System.out.println();
         }

        System.out.println(set);
        System.out.println("Total users: " + set.size());


    }

}
