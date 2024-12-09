import java.util.Scanner;
import java.util.Locale;

public class EX05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int codigo1, quantidade1, codigo2, quantidade2;
        double valor_unitario1, valor_unitario2, valor_total1, valor_total2, valor_final;


        codigo1 = sc.nextInt();
        quantidade1 = sc.nextInt();
        valor_unitario1 = sc.nextDouble();

        valor_total1 = quantidade1 * valor_unitario1;

        codigo2 = sc.nextInt();
        quantidade2 = sc.nextInt();
        valor_unitario2 = sc.nextDouble();

        valor_total2 = quantidade2 * valor_unitario2;

        valor_final = valor_total1 + valor_total2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor_final);


    }
}
