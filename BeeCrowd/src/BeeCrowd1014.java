import java.util.Scanner;

public class BeeCrowd1014 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int X;
        double Y, autonomia;

        X = keyboard.nextInt();
        Y = keyboard.nextDouble();

        System.out.printf("%.3f km/l\n", (X / Y));
        keyboard.close();
    }

}
