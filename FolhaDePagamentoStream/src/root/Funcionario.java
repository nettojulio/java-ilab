package root;

public abstract class Funcionario implements Comparable<Funcionario> {
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
		return "Funcionario: " + nome + "\nRE: " + numeroRegistro + "\n" + getClass();
	}
	
	@Override
	public int compareTo(Funcionario outro) {
		// TODO Auto-generated method stub
		
		if (this.calcularSalario() < outro.calcularSalario()) {
			return -1;
		}
		else if (this.calcularSalario() > outro.calcularSalario()) {
			return 1;
		}
		return 0;
	}

}
