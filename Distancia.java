import java.io.IOException;
import java.util.Scanner;


public class Distancia  {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int distancia = sc.nextInt();
        int min =  distancia * 2;

        System.out.printf("%d minutos\n", min);

         sc.close();

    }

}
