import java.util.Scanner;

public class BeeCrowd1143 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int x = keyboard.nextInt();
        int i = 1;

        while (i <= x) {
            System.out.printf("%d %.0f %.0f\n", i, Math.pow(i, 2), Math.pow(i, 3));
            i++;
        }

        keyboard.close();
    }
}
