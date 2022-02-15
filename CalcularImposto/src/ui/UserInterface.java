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
			options = keyboard.nextInt();
			
			switch(options) {
			case 1:
				System.out.printf("Imposto Devido R$: %.2f\nAliquota: %.2f", contribuintes[0].calcularImposto(), contribuintes[0].aliquota());
				break;
			case 2:
				System.out.printf("Imposto Devido R$: %.2f\nAliquota: %.2f", contribuintes[1].calcularImposto(), contribuintes[1].aliquota());
				break;
			case 3:
				for(int x = 0; x < contribuintes.length; x++) {
					System.out.println(contribuintes[x]);
				}
				break;
			case 0:
				break;
				
			}
		}while (options != 0);
		
		keyboard.close();
	}

}
