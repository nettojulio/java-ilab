import java.util.Scanner;

public class BeeCrowd1002 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        double area, raio;

        raio = teclado.nextDouble();

        area = 3.14159 * raio * raio;

        System.out.printf("A=%.4f\n", area);

        teclado.close();
    }
}