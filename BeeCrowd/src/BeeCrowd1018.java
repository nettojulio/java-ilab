import java.util.Scanner;

public class BeeCrowd1018 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int total, resto, q100, q50, q20, q10, q5, q2, q1;

        total = keyboard.nextInt();

        q100 = total / 100;
        resto = total % 100;

        q50 = resto / 50;
        resto = resto % 50;

        q20 = resto / 20;
        resto = resto % 20;

        q10 = resto / 10;
        resto = resto % 10;

        q5 = resto / 5;
        resto = resto % 5;

        q2 = resto / 2;
        resto = resto % 2;

        System.out.printf(
                "%d\n%d nota(s) de R$ 100,00\n%d nota(s) de R$ 50,00\n%d nota(s) de R$ 20,00\n%d nota(s) de R$ 10,00\n%d nota(s) de R$ 5,00\n%d nota(s) de R$ 2,00\n%d nota(s) de R$ 1,00\n",
                total, q100, q50, q20, q10, q5, q2, resto);
        keyboard.close();
    }
}
