import java.util.Scanner;

public class BeeCrowd1060 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        float value;
        int acc = 0;

        for (int count = 1; count <= 6; count++) {
            value = keyboard.nextFloat();
            if (value > 0) {
                acc++;
            }
        }

        System.out.println(acc + " valores positivos");

        keyboard.close();
    }
}
