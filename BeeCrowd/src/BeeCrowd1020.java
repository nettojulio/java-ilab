import java.util.Scanner;

public class BeeCrowd1020 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int dias, a, m, d;

        dias = keyboard.nextInt();

        a = dias / 365;
        m = (dias - a * 365) / 30;
        d = dias - (a * 365 + m * 30);

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", a, m, d);

        keyboard.close();
    }
}
