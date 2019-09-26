import java.io.IOException;
import java.util.Scanner;

public class Cedulas {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int valor = sc.nextInt();
        int valor1 =  valor;
        int vet[] = new int[7];
        int cedulas[] = {100, 50, 20, 10, 5, 2, 1};

        if (valor > 0 && valor < 1000000) {

            for (int i = 0; i < 7; i++) {
                vet[i] = valor / cedulas[i];
                valor = valor % cedulas[i];


            }
        }

        System.out.printf("%d\n", valor1);
        for (int i = 0; i < 7; i++) {
            System.out.printf("%d nota(s) de R$ %d,00\n", vet[i], cedulas[i]);
        }
    }
}
