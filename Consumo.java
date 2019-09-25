import java.io.IOException;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int distancia = sc.nextInt();
        float gastoDeCombustivel = sc.nextFloat();

        float consumo = distancia/gastoDeCombustivel;


        System.out.printf("%.3f km/l\n", consumo);


        sc.close();


    }


}
