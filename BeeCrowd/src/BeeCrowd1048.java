import java.util.Scanner;

public class BeeCrowd1048 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        double p, a1, a2, a3;
        double s = keyboard.nextDouble();

        p = 0;

        if (s <= 400) {
            p = 0.15;
        } else if (s > 400 && s <= 800) {
            p = 0.12;
        } else if (s > 800 && s <= 1200) {
            p = 0.10;
        } else if (s > 1200 && s <= 2000) {
            p = 0.07;
        } else if (s > 2000) {
            p = 0.04;
        }

        a1 = s + (s * p);
        a2 = s * p;
        a3 = p * 100;

        System.out.printf("Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %.0f %s\n", a1, a2, a3, "%");
        keyboard.close();
    }
}
