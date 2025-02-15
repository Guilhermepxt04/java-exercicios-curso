import java.util.Scanner;
import java.util.Locale;

public class EX022 {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor?");
        int n = sc.nextInt();
        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i=0; i< vectA.length; i++) {

            vectA[i] = sc.nextInt();


        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i=0; i<vectB.length; i++) {

            vectB[i] = sc.nextInt();

        }

        for (int i=0; i< vectC.length; i++) {

            vectC[i] = vectA[i] + vectB[i];

        }

        System.out.println("VETOR RESULTANTE: ");
        for (int j : vectC)

            System.out.println(j);

        sc.close();
    }

}
