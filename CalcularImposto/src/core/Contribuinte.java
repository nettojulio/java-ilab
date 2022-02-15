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

	@Override
	public String toString() {
		return "Contribuinte [numeroCadastral=" + numeroCadastral + ", nome=" + nome + ", endereco=" + endereco
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
