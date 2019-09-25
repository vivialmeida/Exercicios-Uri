import java.io.IOException;
import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int codPeca1 = sc.nextInt();
        int numDePecas1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();

        int codPeca2 = sc.nextInt();
        int numDePecas2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();



        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorPeca1*numDePecas1 + valorPeca2*numDePecas2);

        sc.close();

    }
}
