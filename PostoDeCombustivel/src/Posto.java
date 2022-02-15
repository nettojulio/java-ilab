import java.util.Scanner;

public class Posto {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		Bomba bombas[];
		bombas = new Bomba[4];
		bombas[0] = new Bomba();

		int options;
		double valor;
		int tipo;

		do {
			System.out.println("POSTO XPTO\n\n");
			bombas[0].display();
			tipo = keyboard.nextInt();
			System.out.printf("\n\nOPERAÇÃO\n\n100 - Reais\n200 - Litros\n999 - Sair\n\nDIGITE A OPERAÇÃO: ");
			options = keyboard.nextInt();

			switch (options) {
			case 100:
			case 200:
				System.out.printf("\nInforme o valor em %s : ",
						options == 100 ? "Reais" : options == 200 ? "Litros" : "");
				valor = keyboard.nextDouble();

				if (options == 100) {
					bombas[0].abastecerPorValor(valor, tipo);
				} else if (options == 200) {
					bombas[0].abastecerPorLitro(valor, tipo);
				}
				break;
			case 999:
				System.out.println("\n\nObrigado!!!");
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}

		} while (options != 999);
		keyboard.close();
	}
}
