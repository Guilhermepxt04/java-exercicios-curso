import java.util.Scanner;

public class AulaWhile {

    public static void main(String[] args) {

        /*
        Aula sobre Estrutura de repetição while
        */

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;


        while (x != 0) {

            soma += x;
            x = sc.nextInt();
        }

        System.out.println(soma);

        sc.close();
    }
}