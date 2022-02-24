package factory;

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
		return colaborador;
	}
}
