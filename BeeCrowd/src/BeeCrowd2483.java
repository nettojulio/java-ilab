import java.util.Scanner;

public class BeeCrowd2483 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int x = keyboard.nextInt();
        String repeat = "";

        for (int i = 1; i <= x; i++) {
            repeat = repeat + "a";
        }
        System.out.println("Feliz nat" + repeat + "l!");
        keyboard.close();
    }
}
