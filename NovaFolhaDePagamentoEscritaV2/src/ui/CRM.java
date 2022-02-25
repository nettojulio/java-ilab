package ui;

import java.util.ArrayList;
import java.util.Collection;

import repo.EmployeeRepo;
import repo.FilesRepo;
import repo.StorageRepo;
import root.Funcionario;

public class CRM {

	public static void main(String[] args) {
		ArrayList<Funcionario> headCount;
		try {
			EmployeeRepo repo = new FilesRepo();
			EmployeeRepo repo2 = new StorageRepo();

			headCount = repo.lerTudo();
			headCount.addAll((Collection<? extends Funcionario>) repo2.lerTudo());

			repo.salvarTudo(headCount);
			repo2.salvarTudo(headCount);

		} catch (NumberFormatException ex) {
			System.err.println(ex);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println(ex);
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
}
