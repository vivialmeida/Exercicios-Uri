import java.util.Scanner;
import java.io.IOException;

public class SalarioComBonus {
    public static void main(String[] args) throws  IOException{
        Scanner sc = new Scanner(System.in);

        String nome = sc.next();
        double salarioFixo = sc.nextDouble();
        double vendas = sc.nextDouble();

        double salarioComBonus =  salarioFixo + (vendas* 0.15);

        System.out.printf("TOTAL = R$ %.2f\n",salarioComBonus);

        sc.close();
    }

}
