package core;

public class PF extends Contribuinte {
	protected String cpf;
	protected double rendimentoAnual;
	protected int dependentes;
	private double baseDeCalculo;
	private double aliquota;
	private double impostoDevido;

	public PF(int numeroCadastral, String nome, String endereco, String cpf, double rendimentoAnual, int dependentes) {
		super(numeroCadastral, nome, endereco);
		this.cpf = cpf;
		this.rendimentoAnual = rendimentoAnual;
		this.dependentes = dependentes;
	}

	@Override
	public double calcularImposto() {
		baseDeCalculo = this.rendimentoAnual - (1770 * this.dependentes);
		impostoDevido = baseDeCalculo * this.aliquota();
		return impostoDevido;
	}

	@Override
	public double aliquota() {
		baseDeCalculo = this.rendimentoAnual - (1770 * this.dependentes);
		aliquota = baseDeCalculo < 25000 ? 0
				: (baseDeCalculo >= 25000 && baseDeCalculo < 50000 ? 0.15
						: (baseDeCalculo >= 50000 && baseDeCalculo < 100000 ? 0.2 : 0.275));
		return aliquota;
	}

}
