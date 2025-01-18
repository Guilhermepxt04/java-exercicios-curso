import java.util.Scanner;

public class HelloWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite uma palavra: ");

        String x = sc.next();

        System.out.printf("A palavra que você digitou foi: %s", x);

        sc.close();
    }
}
