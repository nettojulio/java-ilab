package core;

import taxes.BemTributavel;

public class Imovel implements BemTributavel {
	protected String endereco;
	protected double valorVenda;

	public Imovel(String endereco, double valorVenda) {
		super();
		this.endereco = endereco;
		this.valorVenda = valorVenda;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	@Override
	public double CalcularImposto() {
		return 0;
	}

	@Override
	public boolean PassivelDeTributacao() {
		return false;
	}

}
