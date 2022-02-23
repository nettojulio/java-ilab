package ui;

import java.util.Scanner;

import core.Conta;
import core.ContaEspecial;
import exceptions.ContaException;

public class Banco {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		Conta conta1 = new Conta("João", "00011122233", 1, 200.0);
		ContaEspecial conta2 = new ContaEspecial("João", "00011122233", 2, 200.0, 100.0);

		int options;
		int valor;
		try {

			do {
				System.out.printf("PIBank\n\nDigite a opção: ");
				options = keyboard.nextInt();
				valor = keyboard.nextInt();
				switch (options) {
				case 1:
					conta1.creditar(valor);
					System.out.println(conta1.getSaldo());
					break;
				case 2:
					conta1.debitar(valor);
					System.out.println(conta1.getSaldo());
					break;
				case 3:
					conta2.creditar(valor);
					System.out.println(conta2.getSaldo());
					break;
				case 4:
					System.out.println(conta2.debitar(valor));
					System.out.println(conta2.getSaldo());
					System.out.println(conta2.getLimite());
					break;
				case 0:
					System.out.println("Obrigado");
					break;
				default:
					System.out.println("Opção Inválida!");
					break;
				}

			} while (options != 0);
		} catch (ContaException msg) {
			System.err.println("Erro " + msg.getMessage());
			System.err.println("Valor " + msg.getValorInvalido());
		}

		keyboard.close();
	}

}
