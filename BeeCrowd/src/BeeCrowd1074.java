import java.util.Scanner;

public class BeeCrowd1074 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int x = keyboard.nextInt();
        String t = "";

        for (int i = 1; i <= x; i++) {
            int r = keyboard.nextInt();

            if (r != 0) {
                t = r % 2 == 0 ? (t = "EVEN ") : (t = "ODD ");
                t = r > 0 ? (t = t + "POSITIVE") : (t = t + "NEGATIVE");
            } else {
                t = "NULL";
            }

            System.out.println(t);
        }

        keyboard.close();
    }
}
