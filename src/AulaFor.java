import java.util.Scanner;

public class AulaFor {

    public static void main(String[] args) {

        /*
        Aula sobre estrutura de repetição For
        */


        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int soma = 0;
        for (int i=0; i<N; i++) {

            int x = sc.nextInt();
            soma = soma + x;

        }

        System.out.print(soma);

        sc.close();

    }
}
