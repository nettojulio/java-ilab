package br.com.vendingmachines.userinterface;

import java.util.Scanner;

import br.com.vendingmachines.core.Machine;

public class GUI {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		Machine machines;

		machines = new Machine();
		machines.getTotalDeRefrigerantes();

		int options;
		double valor;
		int select;

		System.out.println("ACME Refrigerante Machines\n");

		do {
			System.out.print(
					"OPÇÕES\n\n1 - Inserir Créditos\n2 - Obter Saldo\n3 - Obter Troco\n4 - Comprar Refrigerante\n0 - SAIR\n\nDigite a opção desejada: ");

			options = keyboard.nextInt();

			switch (options) {
			case 1:
				System.out.printf("\n\nINSERIR CRÉDITOS\nSaldo Atual: R$ %.2f\n\nDigite valor que deseja depositar: ",
						machines.getCreditos());
				machines.adicionarCreditos(valor = keyboard.nextDouble());
				break;
			case 2:
				System.out.printf("\n\nOBTER SALDO\n\nSaldo Atual: R$ %.2f%s\n\n", machines.getCreditos(), machines.retornoMenuPrincipal(false));
				break;
			case 3:
				System.out.println("\nOBTER TROCO\n");
				machines.devolverTroco();
				break;
			case 4:	
				System.out.println("\n\nOPÇÕES\n");
				machines.verRefrigerantes();
				select = keyboard.nextInt();
				if (select == 0) {
					System.out.println(machines.retornoMenuPrincipal(false));
					break;
				}
				machines.comprarRefrigerante(select);
				break;
			case 0:
				machines.sairDoSistema();
				break;
			default:
				System.out.println("OPÇÃO INVÁLIDA!!!");
				break;
			}

		} while (options != 0);

		keyboard.close();

	}

}
