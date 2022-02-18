package core.veiculo;

import core.Veiculo;

public class Carro extends Veiculo {
	protected int numeroDePortas;
	protected double potencia;

	public Carro(String marca, String modelo, int ano, double preco, int numeroDePortas, double potencia) {
		super(marca, modelo, ano, preco);
		this.numeroDePortas = numeroDePortas;
		this.potencia = potencia;
	}

	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Tipo: Carro\nnº de Portas: " + numeroDePortas + "\nPotencia: " + potencia + "\nMarca: " + marca + "\nModelo: "
				+ modelo + "\nAno: " + ano + "\nPreco: R$ " + String.format("%.2f", preco) + "\n";
	}

	@Override
	public double CalcularImposto() {
		if (super.ano >= 2000) {
			return super.preco * 0.04;
		}
		return 0.0;
	}

	@Override
	public boolean PassivelDeTributacao() {
		return true;
	}

}
