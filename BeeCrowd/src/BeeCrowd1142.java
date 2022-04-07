import java.util.Scanner;

public class BeeCrowd1142 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int x = keyboard.nextInt();
        int i = 1;

        while (i <= x * 4) {
            System.out.printf("%d %d %d PUM\n", i, i + 1, i + 2);
            i += 4;
        }

        keyboard.close();
    }
}
