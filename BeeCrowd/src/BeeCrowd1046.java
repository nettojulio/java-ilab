import java.util.Scanner;

public class BeeCrowd1046 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int h1, h2;

        h1 = keyboard.nextInt();
        h2 = keyboard.nextInt();

        if (h1 > h2) {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", h2 + 24 - h1);
        } else if (h2 > h1) {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", (h2 - h1));
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        keyboard.close();

        /*
         * int h1, h2,t;
         * 
         * h1 = keyboard.nextInt();
         * h2 = keyboard.nextInt();
         * 
         * t = h2 - h1;
         * 
         * if (t <= 0) {
         * t = t + 24;
         * }
         * 
         * System.out.printf("O JOGO DUROU %d HORA(S)\n", t);
         */
    }
}
