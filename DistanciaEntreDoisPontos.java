import java.util.Scanner;
import java.io.IOException;

public class DistanciaEntreDoisPontos {

    public static void main(String[] args)throws IOException {

        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));


        System.out.printf("%.4f\n", distancia);

        sc.close();

    }
}
