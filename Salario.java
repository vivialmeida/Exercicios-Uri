import java.util.Scanner;
import java.io.IOException;

public class Salario {
    public static void main(String[] args) throws IOException {

        Scanner sc =new Scanner(System.in);
        int numeroFuncionario = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double valorQueRecebe = sc.nextDouble();


        double salario = (horasTrabalhadas * valorQueRecebe);

        System.out.printf("NUMBER = %d\n", numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        sc.close();
    }
}
