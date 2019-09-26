import java.util.Scanner;
import java.io.IOException;

public class GastoDeCombustível {
    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);
        int tempoGasto = sc.nextInt();
        int velocidade = sc.nextInt();
        int distancia = velocidade * tempoGasto;

       double  litros = distancia/12.0;

       System.out.printf("%.3f\n", litros);



    }
}
