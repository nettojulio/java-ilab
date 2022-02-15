
public class Cartao {
	private String numeroCartao;
	private String nomeTitular;
	private int anoValidade;
	private int mesValidade;
	private double saldo;

	public Cartao(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade) {
		this.numeroCartao = numeroCartao;
		this.nomeTitular = nomeTitular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = 0;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getAnoValidade() {
		return anoValidade;
	}

	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}

	public int getMesValidade() {
		return mesValidade;
	}

	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean adicionarCredito(double valor) {
		if (valor <= 0) {
			return false;
		} else {
			this.saldo += valor;
			return true;
		}
	}

	public boolean comprar(double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

}
