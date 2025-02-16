import java.util.Scanner;
import java.util.Locale;

public class EX027 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas: ");
        int n = sc.nextInt();
        double[] arrayHeight = new double[n];
        char[] arrayGenere = new char[n];
        double lowHeight = 99;
        double highHeight = 0;
        double averageFemaleHeight = 0;
        int numberMan = 0;
        int numberFemale = 0;


        for (int i=0; i<arrayHeight.length; i++) {

            System.out.printf("Altura da %da pessoa: ", i + 1);
            arrayHeight[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            arrayGenere[i] = sc.next().charAt(0);

            if (arrayHeight[i] < lowHeight) {
                lowHeight = arrayHeight[i];
            }

            if (arrayHeight[i] > highHeight) {
                highHeight = arrayHeight[i];
            }

            if (arrayGenere[i] == 'M') {
                numberMan += 1;
            }

            if (arrayGenere[i] == 'F') {
                averageFemaleHeight += arrayHeight[i];
                numberFemale += 1;
            }
        }

        averageFemaleHeight = averageFemaleHeight / numberFemale;


        System.out.printf("Menor altura = %.2f%n", lowHeight);
        System.out.printf("Maior altura = %.2f%n", highHeight);
        System.out.printf("Media das alturas das mulheres = %.2f%n", averageFemaleHeight);
        System.out.printf("Numero de homens = %d%n", numberMan);


        sc.close();
    }

}
