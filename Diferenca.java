import java.util.Scanner;
import java.io.IOException;

public class Diferenca {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int diferenca =  (A * B - C * D);

        System.out.println("DIFERENCA = "+ diferenca);

        sc.close();
    }
}

