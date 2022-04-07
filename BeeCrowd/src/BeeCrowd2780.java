import java.util.Scanner;

public class BeeCrowd2780 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int distancia = keyboard.nextInt();
        int pts;

        if (distancia >= 0 && distancia < 801) {
            pts = 1;
        } else if (distancia >= 801 && distancia < 1401) {
            pts = 2;
        } else if (distancia >= 1401 && distancia < 2001) {
            pts = 3;
        } else {
            pts = 0;
        }

        System.out.println(pts);

        keyboard.close();
    }
}
