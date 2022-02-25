package repo;

import java.util.ArrayList;

import core.Chefe;
import core.Comissionado;
import core.Empreiteiro;
import core.Horista;
import root.Funcionario;

public class StorageRepo implements EmployeeRepo {
	@Override
	public ArrayList<Funcionario> lerTudo() {
		ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
		lista.add(new Chefe("Fulano de Tal",1221,  8000, 22, 1500));
		lista.add(new Horista("Fulana de Tal",1222,  150, 85.92));
		lista.add(new Comissionado("Cicrano de Tal",1223,  1300, 25));
		lista.add(new Comissionado("Cicrana de Tal",1224,  1500, 28));
		lista.add(new Horista("Beltrano de Tal",1225,  100, 75.42));
		lista.add(new Horista("Beltrana de Tal",1226,  150, 99.45));
		lista.add(new Empreiteiro("Pedro das Neves",1227,  3500));
		lista.add(new Empreiteiro("Josefa Nunes",1228,  4500));
		lista.add(new Horista("Ana das Fontes",1229, 85, 112.65));
		lista.add(new Horista("Roberto Medeiros",1230, 200, 75.84));
		return lista;
	}
}
