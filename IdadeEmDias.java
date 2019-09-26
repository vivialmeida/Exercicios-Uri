import java.util.Scanner;
import java.io.IOException;

public class IdadeEmDias {

    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);

        int idadeEmDias = sc.nextInt();

        int ano = idadeEmDias/365;
        int mes = (idadeEmDias%365)/30;
        int dias = (idadeEmDias%365)%30;


        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ano, mes, dias);


    }
}
