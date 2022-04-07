import java.util.Scanner;

public class BeeCrowd1174 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double lista[];
        lista = new double[100];

        double valor;

        for (int x = 0; x < 100; x++) {
            valor = keyboard.nextDouble();
            lista[x] = valor;
            if (valor <= 10) {
                System.out.printf("A[%d] = %.1f\n", x, valor);
            }
        }
        keyboard.close();
    }
}
