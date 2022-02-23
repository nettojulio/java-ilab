package ui;

import java.util.ArrayList;

public class Separador {

	public static void main(String[] args) {
		String palavra = "Texto deve ser contado com texto apenas texto";
		String separador[] = palavra.split(" ");
		ArrayList<String> tbt = new ArrayList<>();

		for (int x = 0; x < separador.length; x++) {
			int contador = 0;

			for (int y = 0; y < separador.length; y++) {
				if (separador[x].equals(separador[y])) {
					contador++;
				}
			}

			if (!tbt.contains(separador[x])) {
				tbt.add(separador[x]);
				System.out.println("A palavra" + " \"" + tbt.get(x) + "\"" + " apareceu " + contador + " vezes.");
			}

		}

	}

}
