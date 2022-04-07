import java.util.Scanner;

public class BeeCrowd1064 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        float value;
        int acc = 0;
        float sum = 0;

        for (int count = 1; count <= 6; count++) {
            value = keyboard.nextFloat();
            if (value > 0) {
                acc++;
                sum = sum + value;
            }
        }

        System.out.printf(acc + " valores positivos\n%.1f\n", sum / acc);

        keyboard.close();
    }
}
