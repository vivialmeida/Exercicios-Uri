package iniciante;

import java.util.Scanner;
import java.io.IOException;

public class Media2 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		if ((a >= 0 && a <= 10) && (b >= 0 && b <= 10) && (c >= 0 && c <= 10)) {

			double media = (a * 2 + b * 3 + c * 5) / 10;

			System.out.printf("MEDIA = %.1f\n", media );

			sc.close();
		}

	}
}