import java.util.Scanner;

public class BeeCrowd1144 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int x = keyboard.nextInt();
        double a = 1;
        double b = 1;
        double c = 1;

        for (int i = 1; i <= (x * 2); i++) {
            System.out.printf("%.0f %.0f %.0f\n", a, b, c);
            if (i % 2 != 0) {
                b++;
                c++;
            } else {
                a++;
                b = Math.pow(a, 2);
                c = Math.pow(a, 3);
            }
        }
        keyboard.close();
    }
}
