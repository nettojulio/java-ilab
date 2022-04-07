import java.util.Scanner;

public class BeeCrowd1073 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int x = keyboard.nextInt();
        int a = (x % 2 == 0) ? x : ++x;

        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d^2 = %.0f\n", i, Math.pow(i, 2));
            }
        }
        keyboard.close();
    }
}
