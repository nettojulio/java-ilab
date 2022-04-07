import java.util.Scanner;

public class BeeCrowd1041 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        double x, y;
        String r;

        x = keyboard.nextDouble();
        y = keyboard.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0 || y == 0) {
            r = x == 0 ? "Y" : "X";
            System.out.println("Eixo " + r);
        } else if (y > 0) {
            r = x > 0 ? "1" : "2";
            System.out.println("Q" + r);
        } else {
            r = x > 0 ? "4" : "3";
            System.out.println("Q" + r);
        }
        keyboard.close();
    }
}
