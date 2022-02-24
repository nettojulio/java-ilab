package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import factory.StringParser;
import model.Funcionario;

public class CRM {

	public static void main(String[] args) {
		try {
			File arquivo = new File("./folha.txt");
			FileReader leitor = new FileReader(arquivo);
			BufferedReader br = new BufferedReader(leitor);

			ArrayList<Funcionario> headCount = new ArrayList();
			String dadosFuncionario = "";

			do {
				dadosFuncionario = br.readLine();
				if (dadosFuncionario != null) {
					Funcionario colaborador = StringParser.criarFuncionarioFromCSV(dadosFuncionario);
					headCount.add(colaborador);
				}
			} while (dadosFuncionario != null);
			
			for (Funcionario colaborador : headCount) {
				System.out
						.println(colaborador.getNome() + " R$ " + String.format("%.2f", colaborador.calcularSalario()));
			}
			
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}
}
