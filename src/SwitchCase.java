import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        String dia;

        dia = "";

        x = sc.nextInt();

        dia = switch (x) { 
            case 1 -> "segunda";
            case 2 -> "terça";
            default -> dia;
        };

        System.out.printf("%s", dia);

        sc.close();

    }

}