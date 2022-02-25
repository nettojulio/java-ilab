package core;

import root.Funcionario;

public class Comissionado extends Funcionario {
	protected double salarioBase;
	protected double comissao;

	public Comissionado(String nome, int numeroRegistro, double salarioBase, double comissao) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public double calcularSalario() {
		return salarioBase + (salarioBase * (comissao / 100));
	}

}

