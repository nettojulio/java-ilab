import java.util.Scanner;

public class BeeCrowd1051 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        float s = keyboard.nextFloat();

        if (s >= 0 && s <= 2000) {
            System.out.println("Isento");
        } else if (s > 2000 && s <= 3000) {
            System.out.printf("R$ %.2f\n", (s - 2000) * 0.08);
        } else if (s > 3000 && s <= 4500) {
            System.out.printf("R$ %.2f\n", (s - 3000) * 0.18 + 1000 * 0.08);
        } else {
            System.out.printf("R$ %.2f\n", (s - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08);
        }

        keyboard.close();
    }
}
