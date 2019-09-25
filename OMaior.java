import java.util.Scanner;
import java.io.IOException;

public class OMaior {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int maiorABC = (A + B + Math.abs(A - B ))/ 2;

         maiorABC = (C + maiorABC + Math.abs(maiorABC - C ))/ 2;

        System.out.printf("%d eh o maior\n", maiorABC);

        sc.close();

    }
}


