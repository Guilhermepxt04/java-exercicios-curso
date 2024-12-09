import java.util.Scanner;

public class EX08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        if (A >= B) {
            if (A % B == 0) {

                System.out.println("SAO MULTIPLOS");

            }
            else {

                System.out.println("NAO SAO MULTIPLOS");
            }
        }
        else {

            if (B % A == 0) {

                System.out.println("SAO MULTIPLOS");

            }
            else {

                System.out.println("NAO SAO MULTIPLOS");

            }
        }

        sc.close();
    }
}
