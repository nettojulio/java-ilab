package ui;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;

import repo.EmployeeRepo;
import repo.FilesRepo;
import repo.StorageRepo;
import root.Funcionario;

public class CRM {

	public static void main(String[] args) {
		ArrayList<Funcionario> headCount;
		String currentLine = "";
		try {
			EmployeeRepo repo = new FilesRepo();
			EmployeeRepo repo2 = new StorageRepo();

			headCount = repo.lerTudo();
			headCount.addAll((Collection<? extends Funcionario>) repo2.lerTudo());

			File arquivo = new File("./log.txt");
			FileWriter escritor = new FileWriter(arquivo, true);

			for (Funcionario colaborador : headCount) {
				currentLine = colaborador.getNome() + " R$ " + String.format("%.2f", colaborador.calcularSalario()) + "\n";
				escritor.write(currentLine);
			}

			escritor.close();
		} catch (NumberFormatException ex) {
			System.err.println(ex);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println(ex);
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
}
