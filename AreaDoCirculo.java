package iniciante;

import java.util.Scanner;
import java.io.IOException;
import java.math.*;

public class AreaDoCirculo {

	public static void main(String args[]) throws IOException {

		Scanner sc = new Scanner(System.in);

		double R = sc.nextDouble();

		double A = 3.14159 * R * R;

		System.out.printf("A=%.4f\n", A);

	}

}
