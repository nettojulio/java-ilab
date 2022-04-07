import java.util.Scanner;

public class BeeCrowd1043 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        float A, B, C, r;

        A = keyboard.nextFloat();
        B = keyboard.nextFloat();
        C = keyboard.nextFloat();

        if ((A + B) > C && (B + C) > A && (C + A) > B) {
            r = A + B + C;
            System.out.printf("Perimetro = %.1f\n", r);
        } else {
            r = (A + B) * C / 2;
            System.out.printf("Area = %.1f\n", r);
        }
        keyboard.close();
    }
}
