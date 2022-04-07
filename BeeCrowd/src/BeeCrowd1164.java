import java.util.Scanner;

public class BeeCrowd1164 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int x = keyboard.nextInt();
        int i = 1;
        int acc = 0;

        while (i <= x) {
            int n = keyboard.nextInt();
            for (int t = 1; t < n; t++) {
                if (n % t == 0) {
                    acc = acc + t;
                }
            }

            if (acc - n == 0) {
                System.out.printf("%d eh perfeito\n", n);
            } else {
                System.out.printf("%d nao eh perfeito\n", n);
            }

            acc = 0;
            i++;
        }
        keyboard.close();
    }
}
