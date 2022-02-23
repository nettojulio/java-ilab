package exceptions;

public class ContaException extends Exception {

	private double valorInvalido;

	public ContaException(String msg, double valorInvalido) {
		super(msg);
		this.valorInvalido = valorInvalido;
	}

	public double getValorInvalido() {
		return valorInvalido;
	}

	public void setValorInvalido(double valorInvalido) {
		this.valorInvalido = valorInvalido;
	}

}
