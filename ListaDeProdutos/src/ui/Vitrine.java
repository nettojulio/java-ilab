package ui;

import java.util.ArrayList;
import java.util.Scanner;

import core.Produto;

public class Vitrine {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int totalEmEstoque;
		double valorTotalEmEstoque;
		Produto maisCaro, maisBarato;

		ArrayList<Produto> estoque = new ArrayList<Produto>();

		for (int x = 1; x <= 10; x++) {
			estoque.add(new Produto(x, "Produto " + x, x * 10, 1));
		}

		maisCaro = maisBarato = estoque.get(0);
		totalEmEstoque = 0;
		valorTotalEmEstoque = 0.0;

		for (Produto p : estoque) {
			if (p.getPreco() < maisBarato.getPreco()) {
				maisBarato = p;
			}

			if (p.getPreco() > maisCaro.getPreco()) {
				maisCaro = p;
			}

			// lista.sort(Comparator.comparing(Produto::getPreco));

			totalEmEstoque += p.getQtdEstoque();
			valorTotalEmEstoque += (p.getQtdEstoque() * p.getPreco());
			System.out.println(p);
		}

		System.out.println();
		System.out.println(maisBarato);
		System.out.println(maisCaro);
		System.out.println();
		System.out.println(totalEmEstoque);
		System.out.println(valorTotalEmEstoque);

		keyboard.close();

	}

}
