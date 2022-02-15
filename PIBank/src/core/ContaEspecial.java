package core;

public class ContaEspecial extends Conta {
	private float limite;

	public ContaEspecial(String nomeTitular, String cpf, int numeroDaConta, float saldo, float limite) {
		super(nomeTitular, cpf, numeroDaConta, saldo);
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void alterarLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public boolean debitar(float valor) {
		if (valor <= 0) {
			System.out.println("INVÁLIDO");
			return false;
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
