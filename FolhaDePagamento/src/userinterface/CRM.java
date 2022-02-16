package userinterface;

import java.util.Scanner;

import core.Chefe;
import core.Comissionado;
import core.Empreiteiro;
import core.Funcionario;
import core.Horista;

public class CRM {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int options;
		int re;

		Funcionario funcionarios[] = new Funcionario[4];

		funcionarios[0] = new Chefe("João", 1, 5000.0, 10, 100.0);
		funcionarios[1] = new Comissionado("José", 2, 2500.0, 10);
		funcionarios[2] = new Horista("Pedro", 3, 25.0, 180.0);
		funcionarios[3] = new Empreiteiro("Matheus", 4, 4000.0);

		do {
			System.out.printf(
					"FOPAG\n\n1- CONSULTAR FUNCIONÁRIO\n2 - LISTAR FUNCIONÁRIOS\n0 - SAIR\n\nDigite opção desejada :");
			options = keyboard.nextInt();
			switch (options) {
			case 1:
				System.out.printf("Digite o RE: ");
				re = keyboard.nextInt();
				System.out.println(funcionarios[re - 1].calcularSalario());
				break;
			case 2:
				for (int x = 0; x < funcionarios.length; x++) {
					System.out.println(funcionarios[x]);
					System.out.println(funcionarios[x].calcularSalario());
				}
				break;
			case 0:
				System.out.println("Obrigado!!!");
				break;
			default:
				System.out.println("Opção Inválida!!!");
				break;

			}
		} while (options != 0);

		keyboard.close();
	}
}
