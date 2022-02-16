package core;

public class Horista extends Funcionario {
	protected double valorHora;
	protected double numeroHoras;

	public Horista(String nome, int numeroRegistro, double valorHora, double numeroHoras) {
		super(nome, numeroRegistro);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getNumeroHoras() {
		return numeroHoras;
	}

	public void setNumeroHoras(double numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	@Override
	public double calcularSalario() {
		return valorHora * numeroHoras;
	}
}
