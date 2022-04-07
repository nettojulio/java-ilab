import java.util.Scanner;

public class BeeCrowd1012 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        A = keyboard.nextDouble();
        B = keyboard.nextDouble();
        C = keyboard.nextDouble();

        triangulo = A * C / 2;
        circulo = Math.PI * Math.pow(C, 2);
        trapezio = (A + B) / 2 * C;
        quadrado = Math.pow(B, 2);
        retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n",
                triangulo, circulo, trapezio, quadrado, retangulo);
        keyboard.close();
    }

}
