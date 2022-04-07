import java.util.Scanner;

public class BeeCrowd1070 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int x = keyboard.nextInt();
        int a = (x % 2 == 0) ? ++x : x;

        for (int i = 1; i <= 6; i++) {
            System.out.println(x);
            x += 2;
        }

        keyboard.close();
    }
}
