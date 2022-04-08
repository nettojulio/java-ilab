package br.com.xmlgenerator.fabrica;

import java.lang.reflect.Field;

public class GerarXML {
	public static final int COM_CABECALHO = 1;
	public static final int SEM_CABECALHO = 0;

	public static String geradorXML(Object obj, int modo) {

		StringBuilder str = new StringBuilder();
		if (modo == COM_CABECALHO) {
			str.append("<xml>\n");
		}

		try {
			for (Field f : obj.getClass().getDeclaredFields()) {
				if (f.getType().getName().equals("int") || f.getType().getName().equals("float")
						|| f.getType().getName().equals("double") || f.getType().getName().equals("java.lang.String")) {

					f.setAccessible(true);
					str.append("\t<" + f.getName() + "> " + f.get(obj) + "</" + f.getName() + ">\n");
					f.setAccessible(false);
				} else {
					f.setAccessible(true);
					str.append("\t<" + f.getName() + ">\n" + geradorXML(f.get(obj), SEM_CABECALHO) + "\t</"
							+ f.getName() + ">\n");
					f.setAccessible(false);
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		if (modo == COM_CABECALHO) {
			str.append("</xml>");
		}
		return str.toString();

	}
}
