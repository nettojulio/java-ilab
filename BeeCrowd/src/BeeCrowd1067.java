import java.util.Scanner;

public class BeeCrowd1067 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int x = keyboard.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        keyboard.close();
    }
}
