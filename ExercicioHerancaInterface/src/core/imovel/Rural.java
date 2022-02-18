package core.imovel;

import core.Imovel;

public class Rural extends Imovel {
	protected String tipo;

	public Rural(String endereco, double valorVenda, String tipo) {
		super(endereco, valorVenda);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Tipo: Rural\nAtividade/Ramo: " + tipo + "\nEndereco: " + endereco + "\nValor para venda: R$ " + String.format("%.2f",valorVenda) + "\n"
				;
	}

	@Override
	public double CalcularImposto() {
		return 0.0;
	}

	@Override
	public boolean PassivelDeTributacao() {
		return false;
	}

}
