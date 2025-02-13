import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class EX019 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar?: ");
        int n = sc.nextInt();
        double sum = 0;
        double average = 0;

        double[] vect = new double[n];

        for (int i=0; i< vect.length; i++) {

            vect[i] = sc.nextDouble();
            sum += vect[i];
            average += vect[i];

        }

        average = average / n;

        System.out.println("VALORES = " + Arrays.toString(vect));
        System.out.println("SOMA = " + sum);
        System.out.println("MEDIA = " + average);

        sc.close();
    }

}
