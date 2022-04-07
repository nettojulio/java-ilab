import java.util.Scanner;

public class BeeCrowd1010 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        int cod1, cod2, num1, num2;
        float valor1, valor2, total;

        cod1 = keyboard.nextInt();
        num1 = keyboard.nextInt();
        valor1 = keyboard.nextFloat();
        cod2 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        valor2 = keyboard.nextFloat();

        total = ((valor1 * num1) + (valor2 * num2));

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        keyboard.close();
    }
}
