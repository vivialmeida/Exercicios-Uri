package iniciante;

import java.util.Scanner;
import java.io.IOException;

public class Media1 {

	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();

		if ((A >= 0 && A<=10 )  && (B >= 0 && B<=10)){
			
			double media = (((A *3.5) + (B* 7.5))/ 11);
			
			System.out.printf( "MEDIA = %.5f\n", media);
			
			
			sc.close();
		}
	}

}
