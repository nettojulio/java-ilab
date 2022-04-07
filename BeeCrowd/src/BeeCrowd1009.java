import java.util.Scanner;

public class BeeCrowd1009 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        String nome;
        double salario, comissoes, total;

        nome = keyboard.nextLine();
        salario = keyboard.nextDouble();
        comissoes = keyboard.nextDouble();

        total = salario + comissoes * 0.15;

        System.out.printf("TOTAL = R$ %.2f\n", total);
        keyboard.close();
    }

}
