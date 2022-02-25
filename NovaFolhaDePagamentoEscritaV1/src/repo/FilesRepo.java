package repo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import factory.StringParser;
import root.Funcionario;

public class FilesRepo implements EmployeeRepo {

	@Override
	public ArrayList<Funcionario> lerTudo() {
		try {
			ArrayList<Funcionario> lista;
			lista = new ArrayList<Funcionario>();
			FileReader arquivo = new FileReader(new File("./folha.txt"));
			String linha = "";
			BufferedReader br = new BufferedReader(arquivo);
			do {
				linha = br.readLine();
				if (linha != null) {
					lista.add(StringParser.criarFuncionarioFromCSV(linha));
				}
			} while (linha != null);
			br.close();
			return lista;
		} catch (IOException ex) {
			System.err.println("Erro a ler arquivo");
			ex.printStackTrace();
			return null;
		} catch (RuntimeException ex) {
			throw ex;
		}
	}
}
