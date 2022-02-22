package ui;

import java.util.ArrayList;
import java.util.Scanner;

import core.Produto;

public class Vitrine {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int min, max, totalEmEstoque;
		double valorTotalEmEstoque;
		min = 0;
		max = 0;
		totalEmEstoque = 0;
		valorTotalEmEstoque = 0.0;
		ArrayList<Produto> estoque = new ArrayList<Produto>();

		
		for (int x = 1; x <= 25; x++) {
			estoque.add(new Produto(x, "Produto " + x, x * 100 - estoque.size(), x*estoque.size()));
		}
		
		for(int x = 1;x < estoque.size();x++) {
			if(estoque.get(x).getPreco() < estoque.get(x - 1).getPreco()) {
				min = x;
			}
			
			if(estoque.get(x).getPreco() > estoque.get(x - 1).getPreco()) {
				max = x;
			}
			
			totalEmEstoque += estoque.get(x).getQtdEstoque();
			valorTotalEmEstoque += (estoque.get(x).getQtdEstoque() * estoque.get(x).getPreco());
		}
		
		System.out.println(estoque.get(min));
		System.out.println(estoque.get(max));
		System.out.println(totalEmEstoque);
		System.out.println(valorTotalEmEstoque);
		System.out.println(estoque);
		
		

		keyboard.close();

	}

}
