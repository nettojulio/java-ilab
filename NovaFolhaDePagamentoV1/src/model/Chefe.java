package model;

public class Chefe extends Funcionario {
	protected double salarioBase;
	protected double adicionalFuncao;
	protected double beneficioTerno;

	public Chefe(String nome, int numeroRegistro, double salarioBase, double adicionalFuncao, double beneficioTerno) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getAdicionalFuncao() {
		return adicionalFuncao;
	}

	public void setAdicionalFuncao(double adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}

	public double getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(double beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}

	@Override
	public double calcularSalario() {
		return salarioBase + ((salarioBase * (adicionalFuncao/ 100)) + beneficioTerno);
	}

}

