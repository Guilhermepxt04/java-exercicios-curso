import java.util.Scanner;

public class EX03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, R;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        R = A * B - C * D;

        System.out.printf("DIFERENCA = %d%n", R);

    }
}
