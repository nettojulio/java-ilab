
public class Conta {
	int numero;
	String nome;
	String cpf;
	int tipo;
	double saldo;
	
	void detalharConta() {
		System.out.printf("\nConta corrente: %d\nTitular: %s\nCPF: %s\nTipo da Conta: %d\nSaldo: %.2f\n\n", numero, nome, cpf, tipo, saldo);
	}
	
	void saldoAtual() {
		System.out.printf("\nSaldo atual de: R$ %.2f.\n\n", saldo);
	}
	
	void depositar(double deposito) {
		if (deposito <= 0) {
			System.out.println("\nValor inválido para depósito\nOperação Cancelada\n\n");
		} else {
			saldo += deposito;
			System.out.printf("\nDepósito no valor de R$ %.2f foi realizado com sucesso.\n\n", deposito);
		}
	}
	
	void sacar(double saque) {
		if (saque > saldo) {
			System.out.println("\nSaldo insuficiente.\nOperação Cancelada\n\n");
		} else {
			saldo -= saque;
			System.out.printf("\nSaque no valor de R$ %.2f foi realizado com sucesso.\n\n", saque);
		}
	}
}
