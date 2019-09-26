package iniciante;
import java.io.IOException;	 
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException{

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		double preco = 0.0;

		switch (x) {

		case 1:
			preco = 4.0;
			System.out.printf("Total: R$ %.2f\n", preco * y);
			break;
		case 2:
			preco = 4.50;
			System.out.printf("Total: R$ %.2f\n", preco * y);
			break;
		case 3:
			preco = 5.0;
			System.out.printf("Total: R$ %.2f\n", preco * y);
			break;
		case 4:
			preco = 2.0;
			System.out.printf("Total: R$ %.2f\n", preco * y);
			break;

		case 5:
			preco = 1.50;
			System.out.printf("Total: R$ %.2f\n", preco * y);
			break;
		}

	}
}
