import java.util.Scanner;

public class BeeCrowd1017 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int t, v;
        double a;

        t = keyboard.nextInt();
        v = keyboard.nextInt();

        a = ((float) (v) * (float) (t)) / 12;

        System.out.printf("%.3f\n", a);
        keyboard.close();

    }
}
