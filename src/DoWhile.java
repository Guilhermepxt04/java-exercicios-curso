import java.util.Scanner;
import java.util.Locale;

public class DoWhile {

    public static void main(String[] args) {

        /*
        Aula sobre estrutura de repetição While
        */

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        char resp;
        do {

            System.out.print("Digite a temperatura em Celsius:");

            double tempCelsius = sc.nextDouble();
            double tempFahrenheit = (tempCelsius * 9 / 5) + 32;

            System.out.printf("Equivalente em Fahrenheit: %.1f%n", tempFahrenheit);
            System.out.print("Deseja continuar? (s/n):");

            resp = sc.next().charAt(0);

        } while (resp != 'n');

        sc.close();
    }

}
