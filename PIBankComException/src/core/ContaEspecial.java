package core;

import exceptions.ContaException;

public class ContaEspecial extends Conta {
	private double limite;

	public ContaEspecial(String nomeTitular, String cpf, int numeroDaConta, double saldo, double limite) {
		super(nomeTitular, cpf, numeroDaConta, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void alterarLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public boolean debitar(double valor) throws ContaException {
		if (valor <= 0) {
			throw new ContaException("Valor inválido ", valor);
		} else if (valor > (this.saldo + this.limite)) {
			return false;
		} else {
			if (valor > this.saldo) {
				valor -= this.saldo;
				this.saldo = 0;
				this.limite -= valor;
			} else {
				this.saldo -= valor;
			}
			return true;
		}

	}

}
