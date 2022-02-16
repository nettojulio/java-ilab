package core;

public abstract class Funcionario {
	protected String nome;
	protected int numeroRegistro;
	
	public Funcionario(String nome, int numeroRegistro) {
		super();
		this.nome = nome;
		this.numeroRegistro = numeroRegistro;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	
	public abstract double calcularSalario();
	

	@Override
	public String toString() {
		return "Funcionario: " + nome + "\nRE: " + numeroRegistro + "\n" +getClass();
	}
	
}
