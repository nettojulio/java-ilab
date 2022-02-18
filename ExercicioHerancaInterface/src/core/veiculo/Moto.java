package core.veiculo;

import core.Veiculo;

public class Moto extends Veiculo {
	protected double cilindradas;
	protected String tipo;

	public Moto(String marca, String modelo, int ano, double preco, double cilindradas, String tipo) {
		super(marca, modelo, ano, preco);
		this.cilindradas = cilindradas;
		this.tipo = tipo;
	}

	public double getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(double cilindradas) {
		this.cilindradas = cilindradas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Tipo: Moto\nCilindradas: " + cilindradas + "\nSegmento: " + tipo + "\nMarca: " + marca + "\nModelo: "
				+ modelo + "\nAno: " + ano + "\nPreco: R$ " + String.format("%.2f", preco) + "\n";
	}

	@Override
	public double CalcularImposto() {
		if (this.cilindradas > 500.00) {
			return super.preco * 0.05;
		}
		return super.preco * 0.025;
	}

	@Override
	public boolean PassivelDeTributacao() {
		return true;
	}

}
