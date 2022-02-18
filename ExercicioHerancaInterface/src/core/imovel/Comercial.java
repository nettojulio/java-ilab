package core.imovel;

import core.Imovel;

public class Comercial extends Imovel {
	protected String uso;

	public Comercial(String endereco, double valorVenda, String uso) {
		super(endereco, valorVenda);
		this.uso = uso;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	@Override
	public String toString() {
		return "Tipo: Comercial\nUso: " + uso + "\nEndereco: " + endereco + "\nValor para venda: R$ "
				+ String.format("%.2f", valorVenda) + "\n";
	}

	@Override
	public double CalcularImposto() {
		return super.valorVenda * 0.04;
	}

	@Override
	public boolean PassivelDeTributacao() {
		return true;
	}

}
