package factory;

import core.Chefe;
import core.Comissionado;
import core.Empreiteiro;
import core.Horista;
import exceptions.CSVFileException;
import exceptions.EmployeesDataException;
import root.Funcionario;

public class StringParser {
	public static Funcionario criarFuncionarioFromCSV(String linha) {
		try {
			String[] dados = linha.split(";");
			int type = Integer.parseInt(dados[0].trim());
			switch (type) {
			case 1:
				return new Chefe(dados[2].trim(), Integer.parseInt(dados[1].trim()),
						Double.parseDouble(dados[3].trim()), Double.parseDouble(dados[4].trim()),
						Double.parseDouble(dados[5].trim()));
			case 2:
				return new Comissionado(dados[2].trim(), Integer.parseInt(dados[1].trim()),
						Double.parseDouble(dados[3].trim()), Double.parseDouble(dados[4].trim()));
			case 3:
				return new Horista(dados[2].trim(), Integer.parseInt(dados[1].trim()),
						Double.parseDouble(dados[3].trim()), Double.parseDouble(dados[4].trim()));
			case 4:
				return new Empreiteiro(dados[2].trim(), Integer.parseInt(dados[1].trim()),
						Double.parseDouble(dados[3].trim()));
			default:
				throw new CSVFileException("Arquivo possui inconsistências.");
			}
		} catch (NumberFormatException ex) {
			throw new CSVFileException("Erro ao converter informações do funcionario");
		} catch (ArrayIndexOutOfBoundsException ex) {
			throw new EmployeesDataException("Dados incompletos para o funcionario");
		} catch (Exception ex) {
			throw new RuntimeException("Erro");
		}
	}
}
