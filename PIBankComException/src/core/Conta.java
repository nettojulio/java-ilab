package core;

import exceptions.ContaException;

public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int numeroDaConta;
	protected double saldo;

	public Conta(String nomeTitular, String cpf, int numeroDaConta, double saldo) {
		super();
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void creditar(double valor) {
		if (valor <=0) {
			System.out.println("INVÁLIDO");
			return;
		}
		this.saldo += valor;
	}
	
	public boolean debitar(double valor) throws ContaException {
		if (valor <=0) {
			throw new ContaException("Valor inválido ", valor);
		} else if (valor > this.saldo) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
		
	}

}
