import java.util.Scanner;
import java.util.Locale;

public class EX04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int number;
        double horas, valor_hora, salario;

        number = sc.nextInt();
        horas = sc.nextDouble();
        valor_hora = sc.nextDouble();

        salario = valor_hora * horas;

        System.out.printf("NUMBER: %d%n", number);
        System.out.printf("SALARY: U$ %.2f%n", salario);
    }
}
