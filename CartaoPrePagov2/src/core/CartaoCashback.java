package core;

public class CartaoCashback extends Cartao {
	int tipo;
	double cashback;
	
	public CartaoCashback(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade);
		this.tipo = tipo;
	}

	@Override
	public boolean comprar(double valor) {
		if (saldo >= valor) {
			super.saldo -= valor;
			super.saldo += valor * (this.tipo == 1 ? 0.02 : (this.tipo == 2 ? 0.05 : (this.tipo == 3 ? 0.08 : 2)));
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return super.toString() + " Cartão Cashback "
				+ (this.tipo == 1 ? "Bronze" : (this.tipo == 2 ? "Silver" : (this.tipo == 3 ? "Gold" : "Blank")));
	}

}
