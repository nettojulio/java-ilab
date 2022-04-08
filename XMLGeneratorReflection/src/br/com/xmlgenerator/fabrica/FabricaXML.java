package br.com.xmlgenerator.fabrica;

import java.io.FileWriter;

public class FabricaXML {
	public static void gerarArquivoXML(Object o) {
		try {
			String filename = o.getClass().getSimpleName()+".xml";
			FileWriter arquivo = new FileWriter(filename);
			
			arquivo.write(GerarXML.geradorXML(o, GerarXML.COM_CABECALHO));
			
			arquivo.close();
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
