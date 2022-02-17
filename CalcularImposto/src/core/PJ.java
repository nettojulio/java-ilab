package core;

public class PJ extends Contribuinte {
	protected String cnpj;
	protected double faturamento;
	private double aliquota;
	private double impostoDevido;

	public PJ(int numeroCadastral, String nome, String endereco, String cnpj, double faturamento) {
		super(numeroCadastral, nome, endereco);
		this.cnpj = cnpj;
		this.faturamento = faturamento;
	}

	@Override
	public double calcularImposto() {
		impostoDevido = faturamento * this.aliquota();
		return impostoDevido;
	}

	@Override
	public double aliquota() {
		aliquota = this.faturamento < 100000 ? 0
				: (this.faturamento >= 100000 && this.faturamento < 250000 ? 0.06
						: (this.faturamento >= 250000 && this.faturamento < 450000 ? 0.15 : 0.25));
		return aliquota;
	}
}
