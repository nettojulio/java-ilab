import java.util.Scanner;

public class BeeCrowd1021 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        double valor;
        int c100, c50, c20, c10, c5, c2, m100, m050, m025, m010, m005, cedulas, moedas, resto;

        valor = keyboard.nextDouble();
        cedulas = (int) valor;
        moedas = (int) (valor * 100) - (cedulas * 100);

        c100 = cedulas / 100;
        resto = cedulas % 100;

        c50 = resto / 50;
        resto = resto % 50;

        c20 = resto / 20;
        resto = resto % 20;

        c10 = resto / 10;
        resto = resto % 10;

        c5 = resto / 5;
        resto = resto % 5;

        c2 = resto / 2;
        resto = resto % 2;

        m100 = resto / 1;

        m050 = moedas / 50;
        resto = moedas % 50;

        m025 = resto / 25;
        resto = resto % 25;

        m010 = resto / 10;
        resto = resto % 10;

        m005 = resto / 5;
        resto = resto % 5;

        // m001 = moedas;

        // System.out.println(moedas);

        System.out.printf(
                "NOTAS:\n%d nota(s) de R$ 100.00\n%d nota(s) de R$ 50.00\n%d nota(s) de R$ 20.00\n%d nota(s) de R$ 10.00\n%d nota(s) de R$ 5.00\n%d nota(s) de R$ 2.00\nMOEDAS:\n%d moeda(s) de R$ 1.00\n%d moeda(s) de R$ 0.50\n%d moeda(s) de R$ 0.25\n%d moeda(s) de R$ 0.10\n%d moeda(s) de R$ 0.05\n%d moeda(s) de R$ 0.01\n",
                c100, c50, c20, c10, c5, c2, m100, m050, m025, m010, m005, resto);
        keyboard.close();
    }
}
