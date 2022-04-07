import java.util.Scanner;

public class BeeCrowd1115 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int x, y;
        String q;

        do {
            x = keyboard.nextInt();
            y = keyboard.nextInt();

            if (x == 0 || y == 0) {
                break;
            } else if (x > 0) {
                q = y > 0 ? "primeiro" : "quarto";
            } else {
                q = y > 0 ? "segundo" : "terceiro";
            }

            System.out.println(q);

        } while (x != 0 && y != 0);

        keyboard.close();
    }
}
