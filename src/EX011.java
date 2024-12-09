import java.util.Scanner;

public class EX011 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int password = sc.nextInt();

        while (password != 2002) {

            System.out.println("ACESSO NEGADO");
            System.out.println("DIGITE A SENHA NOVAMENTE:");
            password = sc.nextInt();

        }

        System.out.println("ACESSO PERMITIDO");

    }

}
