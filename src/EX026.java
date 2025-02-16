import java.util.Locale;
import java.util.Scanner;

public class EX026 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados?: ");
        int n = sc.nextInt();


        String[] arrayName = new String[n];
        Double[] arrayNote1 = new Double[n];
        Double[] arrayNote2 = new Double[n];

        for (int i=0; i<arrayName.length; i++) {

            System.out.printf("Digite nome, primeira e segunda nota do %d0 aluno: %n", i + 1);
            sc.nextLine();
            arrayName[i] = sc.nextLine();
            arrayNote1[i] = sc.nextDouble();
            arrayNote2[i] = sc.nextDouble();


        }

        System.out.println("Alunos aprovados: ");

        for (int i=0; i< arrayName.length; i++) {

            if ((arrayNote1[i] + arrayNote2[1]) / 2 >= 6.0) {

                System.out.println(arrayName[i]);

            }

        }


        sc.close();
    }

}
