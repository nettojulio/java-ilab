
public class Bomba {
	private Combustivel combustiveis[];
	private double precoPorLitro;
	private double precoPorReais;

	public Bomba() {
		super();
		this.combustiveis = new Combustivel[6];
		combustiveis[0] = new Combustivel("Etanol Comum", 5.79);
		combustiveis[1] = new Combustivel("Gasolina Comum", 6.79);
		combustiveis[2] = new Combustivel("Etanol Aditivado", 6.09);
		combustiveis[3] = new Combustivel("Gasolina Aditivada", 7.09);
		combustiveis[4] = new Combustivel("Gasolina Premium", 7.49);
		combustiveis[5] = new Combustivel("Diesel", 4.99);
	}

	public void abastecerPorLitro(double valor, int tipo) {
		if (tipo - 1 > combustiveis.length || valor <= 0) {
			System.out.println("Opção inválida!");
			return;
		}
		this.precoPorLitro = valor;
		this.precoPorReais = valor * combustiveis[tipo - 1].getPreco();
		System.out.printf("\n\nCombustível: %s", this.combustiveis[tipo - 1].getTipo());
		System.out.printf("\nTotal em Reais: R$ %.2f\n", this.precoPorReais);
		System.out.printf("Total de litros: %.3f l\n\n", this.precoPorLitro);
	}

	public void abastecerPorValor(double valor, int tipo) {
		if (tipo - 1 > combustiveis.length || valor <= 0) {
			System.out.println("Opção inválida!");
			return;
		}
		this.precoPorReais = valor;
		this.precoPorLitro = valor / combustiveis[tipo - 1].getPreco();
		System.out.printf("\n\nCombustível: %s", this.combustiveis[tipo - 1].getTipo());
		System.out.printf("\nTotal em Reais: R$ %.2f\n", this.precoPorReais);
		System.out.printf("Total de litros: %.3f l\n\n", this.precoPorLitro);
	}

	public void display() {
		for (int x = 0; x < combustiveis.length; x++) {
			System.out.printf("%d - %s - R$ %.2f\n", x+1, combustiveis[x].getTipo(),
					combustiveis[x].getPreco());
		}
		System.out.printf("\n\nDigite a opção de combustível: ");
	}
}
