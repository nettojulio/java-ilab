package core;

public class Contribuinte {
	protected int numeroCadastral;
	protected String nome;
	protected String endereco;

	public Contribuinte(int numeroCadastral, String nome, String endereco) {
		super();
		this.numeroCadastral = numeroCadastral;
		this.nome = nome;
		this.endereco = endereco;
	}

	public double calcularImposto() {
		return 0;
	}

	public double aliquota() {
		return 0;
	}

	public String detalhar() {
		return "Imposto Devido R$ " + String.format("%.2f", calcularImposto()) + "\nAliquota: "
				+ String.format("%.2f", aliquota() * 100) + "%";
	}

	@Override
	public String toString() {
		return "Nome do Contribuinte: " + nome + "\nNum Cadastral: " + numeroCadastral + "\nEndereco: " + endereco
				+ "\n\n" + this.detalhar() + "\n\n\n--------------------------------\n\n";
	}
}
