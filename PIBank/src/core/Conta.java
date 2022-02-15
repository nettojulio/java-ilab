package core;

public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int numeroDaConta;
	protected float saldo;

	public Conta(String nomeTitular, String cpf, int numeroDaConta, float saldo) {
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

	public float getSaldo() {
		return saldo;
	}
	
	public void creditar(float valor) {
		if (valor <=0) {
			System.out.println("INVÁLIDO");
			return;
		}
		this.saldo += valor;
	}
	
	public boolean debitar(float valor) {
		if (valor <=0) {
			System.out.println("INVÁLIDO");
			return false;
		} else if (valor > this.saldo) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
		
	}

}
