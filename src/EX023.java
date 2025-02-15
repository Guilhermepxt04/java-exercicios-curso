import java.util.Locale;
import java.util.Scanner;

public class EX023 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor?: ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double sum = 0;

        for (int i=0; i< vect.length; i++) {

            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();

            sum += vect[i];

        }

        double average = sum / n;

        System.out.println("MEDIA DO VETOR = " + String.format("%.3f", average));

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");

        for (double j : vect) {

            if (j < average) {
                System.out.println(j);
            }
        }
    }

}
