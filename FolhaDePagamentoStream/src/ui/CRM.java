package ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

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

			// repo.salvarTudo(headCount);
			// repo2.salvarTudo(headCount);

			System.out.println("\n\n--------------------\n\n");
			headCount.stream().sorted(Comparator.comparing(p -> p.calcularSalario()))
					.forEach(e -> System.out.println(e + "\n" + e.calcularSalario() + "\n"));
			System.out.println("\n\n--------------------\n\n");
			headCount.stream().sorted(Comparator.comparing(p -> p.getNome()))
					.forEach(e -> System.out.println(e + "\n"));
			System.out.println("\n\n--------------------\n\n");
			headCount.stream().sorted(Comparator.comparing(p -> p.getNumeroRegistro()))
					.forEach(e -> System.out.println(e + "\n"));
			System.out.println("\n\n--------------------\n\n");

		} catch (NumberFormatException ex) {
			System.err.println(ex);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println(ex);
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
}
