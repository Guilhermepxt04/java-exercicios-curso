import java.util.Locale;
import java.util.Scanner;

public class EX021 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?: ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double flag = 0;
        int posicaoMaiorNumero = 0;
        double maiorNumero = 0;

        for (int i = 0; i< vect.length; i++) {

            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();

            if  (vect[i] > flag) {

                maiorNumero = vect[i];
                posicaoMaiorNumero = i;

            }

            flag = vect[i];

        }

        System.out.println("MAIOR VALOR = " + String.format("%.2f", maiorNumero));
        System.out.print("POSICAO DO MAIOR VALOR = " + posicaoMaiorNumero);

        sc.close();
    }

}
