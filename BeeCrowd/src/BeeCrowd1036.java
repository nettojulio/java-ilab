import java.util.Scanner;

public class BeeCrowd1036 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        double c = keyboard.nextDouble();

        double delta = Math.pow(b, 2.0) - 4 * a * c;

        double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        if (x1 * 0 != 0 || x2 * 0 != 0) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f\nR2 = %.5f\n", x1, x2);
        }

        keyboard.close();
    }
}
