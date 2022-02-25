package repo;

import java.util.ArrayList;

import root.Funcionario;

public interface EmployeeRepo {
	public ArrayList<Funcionario> lerTudo();
	public void salvarTudo(ArrayList<Funcionario> lista);
}
