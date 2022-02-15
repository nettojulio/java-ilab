package br.com.vendingmachines.core;

public class Machine {
	private double creditos;
	private Soda refrigerantes[];
	// refrigerantes=new Soda[5];

	public Machine() {
		this.creditos = 0;
//		this.refrigerantes = new Soda[5];
//		refrigerantes[0] = new Soda(1, "Coca", 3.5, 10);
//		refrigerantes[1] = new Soda(2, "Sprite", 2.25, 3);
//		refrigerantes[2] = new Soda(3, "Fanta", 3, 8);
//		refrigerantes[3] = new Soda(4, "Kuat", 2, 0);
//		refrigerantes[4] = new Soda(5, "Del Valle", 4, 1);
	}

	public double getCreditos() {
		return creditos;
	}

	public void adicionarCreditos(double creditos) {
		if (creditos <= 0) {
			System.out.println("\nValor inválido!" + this.retornoMenuPrincipal(true));
			return;
		}
		this.creditos += creditos;
		System.out.printf("\nNovo Saldo : R$ %.2f%s\n\n", this.creditos, this.retornoMenuPrincipal(false));
	}

	public void devolverTroco() {
		if (this.creditos <= 0) {
			System.out.printf("Não existem valores para troco!\nSaldo R$ %.2f\n%s\n\n", this.creditos,
					this.retornoMenuPrincipal(true));
			return;
		}
		System.out.printf("Troco devolvido: R$ %.2f%s\n\n", this.creditos, this.retornoMenuPrincipal(false));
		this.creditos = 0;
	}

	public int getTotalDeRefrigerantes() {
		return this.refrigerantes.length;
	}

	public void verRefrigerantes() {
		for (int x = 0; x < refrigerantes.length; x++) {
			System.out.printf("%d - %s\nR$ %.2f\n\n", refrigerantes[x].getId(), refrigerantes[x].getNome(),
					refrigerantes[x].getPreco());
		}
		System.out.print("\nDIGITE O REFRIGERANTE DESEJADO OU 0 PARA SAIR: ");
	}

	public void comprarRefrigerante(int opcao) {
		int posicao = opcao - 1;
		if (opcao > this.refrigerantes.length) {
			System.out.println("\nOpção inválida!\n" + this.retornoMenuPrincipal(true));
			return;
		} else if (refrigerantes[posicao].getPreco() > this.creditos) {
			System.out.println("\nSaldo insuficiente!\n" + this.retornoMenuPrincipal(true));
			return;
		} else if (refrigerantes[posicao].getEstoque() == 0) {
			System.out.println("\nEstoque de " + refrigerantes[posicao].getNome() + " acabou!\nEscolha outra opção\n"
					+ this.retornoMenuPrincipal(false));
			return;
		} else {
			this.refrigerantes[posicao].setEstoque(this.refrigerantes[posicao].getEstoque() - 1);
			this.creditos -= this.refrigerantes[posicao].getPreco();
			System.out.println("\nCompra efetuada com sucesso!" + this.retornoMenuPrincipal(false));
			return;
		}
	}

	public String retornoMenuPrincipal(boolean erro) {
		String msg = "\nRetornando ao MENU PRINCIPAL...\n\n";
		msg = erro ? "\nOperação Cancelada!!!" + msg : msg;
		return msg;
	}

	public void sairDoSistema() {
		if (this.creditos != 0) {
			System.out.printf("Aguarde a devolução do troco (R$ %.2f)!\n\n", this.creditos);
			this.devolverTroco();
		}
		System.out.println("Obrigado!");
	}

}
