import java.util.Scanner;

public class BeeCrowd1047 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int h1, m1, h2, m2, t;

        h1 = keyboard.nextInt();
        m1 = keyboard.nextInt();
        h2 = keyboard.nextInt();
        m2 = keyboard.nextInt();

        t = (h2 - h1) * 60 + (m2 - m1);

        if (t <= 0) {
            t = t + 24 * 60;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", (t / 60), (t % 60));

        keyboard.close();
    }
}
