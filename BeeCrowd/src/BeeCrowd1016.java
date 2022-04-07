import java.util.Scanner;

public class BeeCrowd1016 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int x = keyboard.nextInt();
        System.out.printf("%d minutos\n", x * 2);

        keyboard.close();
    }
}