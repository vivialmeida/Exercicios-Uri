    import java.io.IOException;
    import java.util.Scanner;

    public class Esfera {

        public static void main(String[] args) throws IOException {
             double pi = 3.14159;

            Scanner sc = new Scanner(System.in);
            double raio = sc.nextDouble();

            double volume = (4/3.0) * pi * Math.pow(raio, 3);

            System.out.printf("VOLUME = %.3f\n", volume);

            sc.close();
        }
    }
