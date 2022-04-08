import java.util.HashMap;

public class Separador {

	public static void main(String[] args) {
		String texto = "Teste teste teste outro além Teste teste";
		HashMap<String, Integer> resultado = new HashMap<String, Integer>();
		String load[] = texto.split(" ");

		for (String p : load) {
			if (resultado.get(p) != null) {
				resultado.replace(p, resultado.get(p) + 1);
			} else {
				resultado.put(p, 1);
			}
		}
		System.out.println(resultado);
	}

}
