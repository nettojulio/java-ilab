package ui;

import java.util.Scanner;

import core.Contribuinte;
import core.PF;
import core.PJ;

public class UserInterface {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int options;

		Contribuinte contribuintes[];
		contribuintes = new Contribuinte[2];

		contribuintes[0] = new PF(1, "Humano", "Rua A", "000.111.222-33", 100000.0, 0);
		contribuintes[1] = new PJ(2, "Empresa S/A", "Rua B", "0000.1112.2233/0001-00", 250000.0);

		do {
			System.out.println("1 - Cliente PF\n2 - Cliente PJ\n3 - Detalhar Clientes\n0 - SAIR\n\n");
			options = keyboard.nextInt();

			switch (options) {
			case 1:
				System.out.println(contribuintes[0].detalhar());
				break;
			case 2:
				System.out.println(contribuintes[1].detalhar());
				break;
			case 3:
				for (int x = 0; x < contribuintes.length; x++) {
					System.out.println(contribuintes[x]);
				}
				break;
			case 0:
				break;

			}
		} while (options != 0);

		keyboard.close();
	}

}
