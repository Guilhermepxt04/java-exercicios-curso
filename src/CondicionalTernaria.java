import java.util.Scanner;

public class CondicionalTernaria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double preco;

        preco = sc.nextDouble();

        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05; //reduzo o codigo fazendo a estrutura de decisao já na variavel

        System.out.printf("DESCONTO = %.2f", desconto);

    }
}
