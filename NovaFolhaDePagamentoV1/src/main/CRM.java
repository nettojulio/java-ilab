package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

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
					Funcionario colaborador = null;
					String[] dados = dadosFuncionario.split(";");
					int type = Integer.parseInt(dados[0].trim());

					switch (type) {
					case 1:
						colaborador = new Chefe(dados[2].trim(), Integer.parseInt(dados[1].trim()),
								Double.parseDouble(dados[3].trim()), Double.parseDouble(dados[4].trim()),
								Double.parseDouble(dados[5].trim()));
						break;
					case 2:
						colaborador = new Comissionado(dados[2].trim(), Integer.parseInt(dados[1].trim()),
								Double.parseDouble(dados[3].trim()), Double.parseDouble(dados[4].trim()));
						break;
					case 3:
						colaborador = new Horista(dados[2].trim(), Integer.parseInt(dados[1].trim()),
								Double.parseDouble(dados[3].trim()), Double.parseDouble(dados[4].trim()));
						break;
					case 4:
						colaborador = new Empreiteiro(dados[2].trim(), Integer.parseInt(dados[1].trim()),
								Double.parseDouble(dados[3].trim()));
						break;
					default:
						break;
					}
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
