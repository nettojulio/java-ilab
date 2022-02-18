package core.imovel;

import core.Imovel;

public class Residencial extends Imovel {
	protected double metragem;

	public Residencial(String endereco, double valorVenda, double metragem) {
		super(endereco, valorVenda);
		this.metragem = metragem;
	}

	public double getMetragem() {
		return metragem;
	}

	public void setMetragem(double metragem) {
		this.metragem = metragem;
	}

	@Override
	public String toString() {
		return "Tipo: Residencial\nMetragem: " + metragem + "m²" + "\nEndereco: " + endereco + "\nValor para venda: R$ " + String.format("%.2f",valorVenda)
				+ "\n";
	}

	@Override
	public double CalcularImposto() {
		if (this.metragem > 100.00) {
			return super.valorVenda * 0.03;
		}
		return super.valorVenda * 0.015;
	}
	
	@Override
	public boolean PassivelDeTributacao() {
		return true;
	}

}
