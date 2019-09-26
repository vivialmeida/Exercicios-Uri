import java.io.IOException;
import java.util.Scanner;


public class ConversaoDeTempo  {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int segundos = sc.nextInt();
        int hora = segundos/ 3600;
        int minutos = (segundos%3600)/60;
        int seg = (segundos%3600)%60;


        System.out.printf("%d:%d:%d\n" , hora, minutos, seg);




    }
}
