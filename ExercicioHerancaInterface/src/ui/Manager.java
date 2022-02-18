package ui;

import java.util.Scanner;

import core.Imovel;
import core.Veiculo;
import core.imovel.Comercial;
import core.imovel.Residencial;
import core.imovel.Rural;
import core.veiculo.Carro;
import core.veiculo.Moto;

public class Manager {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		Veiculo frota[] = new Veiculo[4];
		Imovel construcoes[] = new Imovel[6];

		frota[0] = new Carro("HYUNDAI", "HB20", 2001, 20990.90, 4, 1000.00);
		frota[1] = new Carro("TOYOTA", "Hilux", 1995, 37000.00, 2, 2000.00);
		frota[2] = new Moto("SUZUKI", "V-STROM", 2020, 49790.00, 650.00, "TRAIL");
		frota[3] = new Moto("HONDA", "PCX", 2021, 19990.00, 150.00, "SCOOTER");

		construcoes[0] = new Residencial("endereco 1", 150000.00, 120.05);
		construcoes[1] = new Residencial("endereco 2", 150000.00, 120.05);
		construcoes[2] = new Comercial("endereco 3", 300000.00, "Estética");
		construcoes[3] = new Comercial("endereco 4", 1300000.00, "Shopping Center");
		construcoes[4] = new Rural("endereco 5", 2500000.00, "Produtor de Celulose");
		construcoes[5] = new Rural("endereco 6", 3000000.00, "Produtor de Grãos");

		for (Veiculo type : frota) {
			System.out.println(type.toString());
			if (type.PassivelDeTributacao()) {
				System.out.println("IMPOSTO DEVIDO: R$ " + String.format("%.2f", type.CalcularImposto()) + "\n");
			} else {
				System.out.println("SITUAÇÃO: ISENTO\n");
			}
		}

		for (Imovel type : construcoes) {
			System.out.println(type.toString());
			if (type.PassivelDeTributacao()) {
				System.out.println("IMPOSTO DEVIDO: R$ " + String.format("%.2f", type.CalcularImposto()) + "\n");
			} else {
				System.out.println("SITUAÇÃO: ISENTO");
			}
		}

		keyboard.close();

	}

}
