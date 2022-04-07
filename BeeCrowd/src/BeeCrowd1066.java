import java.util.Scanner;

public class BeeCrowd1066 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int value;
        int pairs = 0;
        int odds = 0;
        int positives = 0;
        int negatives = 0;
        int a, b, c;

        for (int count = 1; count <= 5; count++) {
            value = keyboard.nextInt();
            a = (value % 2 == 0) ? pairs++ : odds++;
            b = (value > 0 && value != 0) ? positives++ : negatives++;
            c = value == 0 ? negatives-- : negatives;

        }

        System.out.printf(
                "%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n",
                pairs, odds, positives, negatives);
        keyboard.close();
    }
}
