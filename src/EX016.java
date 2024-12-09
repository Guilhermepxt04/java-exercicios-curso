import java.util.Scanner;

public class EX016 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        for (double i=1; i <= 5; i++) {

            double quadrado, cubo;

            System.out.printf("%.0f %.0f %.0f%n", i, quadrado = Math.pow(i, 2.0), cubo = Math.pow(i, 3.0));

        }


        sc.close();
    }

}


