import java.util.Scanner;

public class BeeCrowd1134 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int x, a, b, c;
        a = 0;
        b = 0;
        c = 0;

        do {
            x = keyboard.nextInt();

            if (x == 1) {
                a++;
            } else if (x == 2) {
                b++;
            } else if (x == 3) {
                c++;
            }

        } while (x != 4);

        System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d\n", a, b, c);

        keyboard.close();
    }
}