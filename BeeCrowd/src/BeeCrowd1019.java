import java.util.Scanner;

public class BeeCrowd1019 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int tempo, h, m, s;

        tempo = keyboard.nextInt();

        s = tempo % 60;
        h = (tempo - s) / 3600;
        m = (tempo - (h * 3600)) / 60;

        System.out.printf("%d:%d:%d\n", h, m, s);

        keyboard.close();
    }
}
