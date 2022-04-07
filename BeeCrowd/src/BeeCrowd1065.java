import java.util.Scanner;

public class BeeCrowd1065 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int value;
        int acc = 0;

        for (int count = 1; count <= 5; count++) {
            value = keyboard.nextInt();
            if (value % 2 == 0) {
                acc++;
            }
        }

        System.out.println(acc + " valores pares");

        keyboard.close();
    }
}
