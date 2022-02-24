package factory;

import exceptions.CSVFileException;
import exceptions.EmployeesDataException;

import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class StringParser {
	public static Funcionario criarFuncionarioFromCSV(String linha) {
		Funcionario colaborador = null;
		String[] dados = linha.split(";");
		int type = Integer.parseInt(dados[0].trim());

		switch (type) {
		case 1:
			if (dados.length != 6) {
				throw new CSVFileException("Formato de linha CSV invalido");
			}
			try {
				colaborador = new Chefe(dados[2].trim(), Integer.parseInt(dados[1].trim()),
						Double.parseDouble(dados[3].trim()), Double.parseDouble(dados[4].trim()),
						Double.parseDouble(dados[5].trim()));
			} catch (NumberFormatException | NullPointerException ex) {
				throw new EmployeesDataException("Dados Inválidos");
			}
			break;
		case 2:
			if (dados.length != 5) {
				throw new CSVFileException("Formato de linha CSV invalido");
			}
			try {
				colaborador = new Comissionado(dados[2].trim(), Integer.parseInt(dados[1].trim()),
						Double.parseDouble(dados[3].trim()), Double.parseDouble(dados[4].trim()));
			} catch (NumberFormatException | NullPointerException ex) {
				throw new EmployeesDataException("Dados Inválidos");
			}
			break;
		case 3:
			if (dados.length != 5) {
				throw new CSVFileException("Formato de linha CSV invalido");
			}
			try {
				colaborador = new Horista(dados[2].trim(), Integer.parseInt(dados[1].trim()),
						Double.parseDouble(dados[3].trim()), Double.parseDouble(dados[4].trim()));
			} catch (NumberFormatException | NullPointerException ex) {
				throw new EmployeesDataException("Dados Inválidos");
			}
			break;
		case 4:
			if (dados.length != 4) {
				throw new CSVFileException("Formato de linha CSV invalido");
			}
			try {
				colaborador = new Empreiteiro(dados[2].trim(), Integer.parseInt(dados[1].trim()),
						Double.parseDouble(dados[3].trim()));
			} catch (NumberFormatException | NullPointerException ex) {
				throw new EmployeesDataException("Dados Inválidos");
			}
			break;
		default:
			throw new CSVFileException("Arquivo possui inconsistências.");
		}
		return colaborador;
	}
}
